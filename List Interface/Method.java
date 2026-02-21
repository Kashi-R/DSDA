import java.util.*;
public class Method {

    static void printlist(List<?> list){
        for (Object X : list)
        System.out.println(X);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a_list = new ArrayList<>();
        LinkedList<String> l_list = new LinkedList<>();

        a_list.add(2);
        a_list.add(3);
        a_list.add(4);
        a_list.add(5);
        a_list.add(0,1);
        
        System.out.println(a_list);
        // printlist(a_list);//print by method.
        System.out.println( a_list.get(2));
        //faster in arraylist O(1)

        a_list.set(3, 6);
        System.out.println(a_list);

        a_list.remove(2);
        a_list.remove(Integer.valueOf(6));
        System.out.println(a_list);
        //for object type we can use both index and objectName remove,
        //But for primitive type we can remove by index and for value we have to write Wrapperclassname.valueof()
        //this rule is for all list i.e AL and LL.
        System.out.println(a_list);

        System.out.println("size of list is "+a_list.size());
        System.out.println(a_list.contains(5));
        a_list.removeIf(n->n%2==0);
        System.out.println(a_list);
        a_list.add(10);
        a_list.add(11);
        a_list.add(12);
        a_list.add(13);
        System.out.println("Now list becomes after some additon "+a_list);
        for(int i=0;i<5;i++){
            System.out.print(" "+a_list.get(i));
        }
        System.out.println();


       System.out.println("_________________________");
       l_list.add("Kashi");
       l_list.add("bibek");
       l_list.add("Rajiv");
       l_list.add("Jitu");
       l_list.add(3,"Avishek");
       System.out.println(l_list);

       System.out.println(l_list.get(0));
       //slower in linked list O(n)

       l_list.set(0, "King");
       System.out.println(l_list);

       l_list.remove("King");
       l_list.remove(2);
       System.out.println(l_list);

       System.out.println("size of list is "+l_list.size());

       System.out.println(l_list.contains("Rajiv"));

       l_list.addFirst("Don");
       
       l_list.removeLast();
       System.out.println(l_list);
       //linked list supporrt extra method like addFirst,removeFirst,addLast,removeLast , 
       //which arraylist doesn't support.

    }
}
