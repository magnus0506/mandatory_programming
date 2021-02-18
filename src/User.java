import java.util.*;
import java.util.stream.IntStream;

public class User {
    private static int age1;
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getAgeStatic() {
        return age1;
    }

    public int maxNameLength(User u1, User u2){
        Integer ii = u1.getName().length();
        return ii.compareTo(u2.getName().length());
    }

    public static int maxAge(User u1, User u2){
        Integer ii = u1.getAge();
        return ii.compareTo(u2.getAge());
    }

    public User maxUserAge (List<User> list){
        return list.stream().max(User::maxAge).get();
    }

    public static int userAgeSum(Map<String, Integer> users){

        return users
                .values()
                .stream()
                .mapToInt(x -> x.intValue()).sum();

    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
