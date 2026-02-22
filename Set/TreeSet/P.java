import java.util.*;

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class P {
    public static void main(String[] args) {
        Comparator<User> byNameThenId = Comparator.comparing(User::getName).thenComparingInt(User::getId);

        TreeSet<User> users = new TreeSet<>(byNameThenId);

        users.add(new User(2, "Ashi"));
        users.add(new User(1, "Ashi")); // same name, different ID
        users.add(new User(3, "Kashi"));

        for (User u : users) {
            System.out.println(u);
        }
    }
}
