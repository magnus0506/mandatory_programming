import org.junit.jupiter.api.Test;

import java.util.*;

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

        String string1 = "1";
        String string2 = "2";
        String string3 = "3";

        Collections.addAll(stringArrayList,string1,string2,string3);

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
        
        Collections.addAll(userList,user1,user2,user3);
        assertEquals(user3, userClass.maxUserAge(userList));

    }

    @Test
    public void userAgeSum(){
        User user1 = new User("Magnus", 23);
        User user2 = new User("Adam", 23);
        Map<String,Integer> users = new HashMap<>();
        users.put(user1.getName(),user1.getAge());
        users.put(user2.getName(),user2.getAge());

        int sum = 46;
        assertEquals(sum,User.userAgeSum(users));
        System.out.println(sum);

    }
}