import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class TestClass {

Calculate calculate = new Calculate();
User userClass = new User();


    @Test
    void calc() {

        int a = 5;
        int b = 10;

        try{
            assertEquals(15,calculate.calc(a,b));
            System.out.println("pass");
        } catch (AssertionError error){
            System.out.println("fail");
        }
    }

    @Test
    void printLambda() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("String 1");
        stringArrayList.add("String 2");
        stringArrayList.add("String 3");

        assertEquals(stringArrayList, Calculate.printLambda(stringArrayList));
    }

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
    public void maxUserAge (){
        List<User> userList = new ArrayList<>();
        User user1 = new User("Magnus", 23);
        User user2 = new User("Jean", 25);
        User user3 = new User("Adam", 30);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        assertEquals(user3, userClass.maxUserAge(userList));

    }
}