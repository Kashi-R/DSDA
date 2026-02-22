package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class User {
    int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id = " + id + " name is : " + name;
    }

    @Override
    public boolean equals(Object o) {
        // TODO Auto-generated method stub
        if (this == o)
            return true;
        if (!(o instanceof User))
            return false;
        User u = (User) o;
        return id == u.id && Objects.equals(name, u.name);
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(id, name);
    }
    // these overriden methods are for equality check ,
    // if we not use them then for costom objects it will treat as
    // different,although they have same value.
    // but for string,integer(built-in) it will automatically check , it' methods
    // equals() and hash().
}

public class HasSet {
    public static void main(String[] args) {
        Set<String> Email = new HashSet<>();

        Email.add("Kashi@gmail.com");
        Email.add("Bbek@gmail.com");
        Email.add("Abhishek@gmail.com");
        Email.add("Rajib@gmail.com");
        Email.add("Rajib@gmail.com");

        System.out.println(Email);
        System.out.println("__________________________");
        for (String X : Email) {
            System.out.println(X);
        }
        System.out.println("__________________________");
        Iterator<String> it = Email.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Set<User> user = new HashSet<>();
        user.add(new User(1, "Kashi"));
        user.add(new User(2, "Bibek"));
        user.add(new User(3, "Rajib"));
        user.add(new User(3, "Rajib"));

        for (User X : user) {
            System.out.println(X);
        }
    }
}
