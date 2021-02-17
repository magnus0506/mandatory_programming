import java.util.List;

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
        User user = list.stream().max((a,b) -> User.maxAge(a,b)).get();
        return user;
    }

    public static List<User> totalAge (List<User> list){
        int age = 0;
        list.forEach((a, b) -> list.get(a.getAge()) + list.get(b).getAge());
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
