import java.util.*;

public class Demo {
    public static void main(String[] args) {

         TreeSet<String> Nam = new TreeSet<>();

        Nam.add("Ashi");
        Nam.add("Kashi");
        Nam.add("Bashi");

        System.out.println(Nam);//normal store in sorted manner.

System.out.println("__________________________");

        Comparator<String> reverseOrder = (a, b) -> b.compareTo(a);//reversed the object for reversed b.compareTo(a)
        TreeSet<String> names = new TreeSet<>(reverseOrder);

        names.add("Ashi");
        names.add("Kashi");
        names.add("Bashi");

        System.out.println(names); // [Kashi, Bashi, Ashi] store in reverse sorted .
    }
}
