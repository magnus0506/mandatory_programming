import org.junit.Rule;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


class TestClass {

User userClass = new User();
List<User> userList = new ArrayList<>();
    @Rule
    public final TestRule watchman = new TestWatcher() {

        protected void failed(Throwable e, Description description) {
            // Print out the error message:
            System.out.println(description.getDisplayName() + " " + e.getClass().getSimpleName() + "\n");
            // Now you can do whatever you need to do with it, for example take a screenshot

        }
    };

 @Test
    void maxNameLengthTest(){
        User user1 = new User("Magnus", 23);
        User user2 = new User("Jean", 25);
        assertEquals(1,userClass.maxNameLength(user1,user2));
    }

    @Test
    void maxAgeTest(){
        User user1 = new User("Magnus", 23);
        User user2 = new User("Jean", 25);
        assertEquals(-1, User.maxAge(user1,user2));
    }

    @Test
    void maxAgeTest2(){

        User user1 = new User("Magnus", 23);
        User user2 = new User("Jean", 25);
        User user3 = new User("Mikkel", 31);
        User user4 = new User("Lisbeth", 21);
        User user5 = new User("Ida", 65);
        User user6 = new User("Rasmus", 41);
        User user7 = new User("Christoffer", 36);
        User user8 = new User("Jean", 35);

        Collections.addAll(userList, user1,user2,user3,user4,user5,user6,user7,user8);
        Double sum = 65.0;
        assertEquals(sum, User.maxAgeList(userList));
    }

    @Test
    public void userAgeSum(){
        User user1 = new User("Magnus", 23);
        User user2 = new User("Adam", 30);
        Map<String,Integer> users = new HashMap<>();
        users.put(user1.getName(),user1.getAge());
        users.put(user2.getName(),user2.getAge());
        Double sum = 26.5;
        assertEquals(sum,User.userAgeAvg(users));
        System.out.println();

    }

    @Test
    public void maxUserAge (){
        User user1 = new User("Magnus", 23);
        User user2 = new User("Jean", 25);
        User user3 = new User("Adam", 30);

        Collections.addAll(userList,user1,user2,user3);
        assertEquals(user3, userClass.maxUserAge(userList));

    }
}