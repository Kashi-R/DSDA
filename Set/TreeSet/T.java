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
public class T{
    public static void main(String[] args) {
        
Comparator<User> byName = (u1, u2) -> u1.name.compareTo(u2.name);
TreeSet<User> users = new TreeSet<>(byName);

users.add(new User(1, "Ashi"));
users.add(new User(2, "Ashi"));
users.add(new User(3, "Kashi"));
users.add(new User(4, "Bashi"));

System.out.println(users); // Sorted by name
    }
}