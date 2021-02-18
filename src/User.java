import java.util.*;
import java.util.stream.IntStream;

public class User {
    private String name;
    private int age;

    public User() {}

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

    public void setAge(int age) {
        this.age = age;
    }

    public int maxNameLength(User u1, User u2){
        Integer ii = u1.getName().length();
        return ii.compareTo(u2.getName().length());
    }

    public static int maxAge(User u1, User u2){
        Integer ii = u1.getAge();
        return ii.compareTo(u2.getAge());
    }

    public static int maxAgeList(List<User> list){
        int userMaxAge = list
                .stream()
                .mapToInt(x -> x.getAge())
                .max().getAsInt();
        return userMaxAge;
    }

    public User maxUserAge (List<User> list){
        return list.stream().max(User::maxAge).get();
    }

    public static Double userAgeAvg(Map<String, Integer> users){

        return users
                .values()
                .stream()
                .mapToInt(x -> x.intValue()).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
