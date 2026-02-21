import java.util.*;
class Student{
    int id;
    String name;

public Student(int id,String name){
    this.id=id;
    this.name=name;
}
public String getName(){
    return name;
}
public int getId(){
    return this.id;
}


@Override
public String toString() {

    return "Student{id=" + id + ", name='" + name + "'}";
}
public static void RemoveById(List<Student> list,int id){
    // for (Student X : list) {
    //     if (X.getId()==id) {
    //         list.remove(X);
    //     }
    // }// this will cause exception in main thread, so use iterator

    for(int i =0;i<list.size();i++){
        if (list.get(i).getId()==id) {
            list.remove(i);
        }
    }
    // other wise we can remove by using RemoveIF()-->BEST
   // list.removeIf(a->a.getId()==id);
}


}
public class Problem {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(0,new Student(1, "Kashi"));//adding by index
        list.add(new Student(2,"Kedar"));//first added i.e index 0
        list.add(new Student(3,"Bibek"));
        list.add(new Student(4,"Nagen"));
        list.add(new Student(5,"Khageswar"));
        list.add(new Student(6,"Jitu"));

        
        for (Student X : list) {//for each loop (int X : arr)
            System.out.println(X);
        }
        

        //to access a particular student info we have to use getter setter method
        Student s = list.get(3);
        System.out.println(s.getName());


        System.out.println("enter the id to find");
        Scanner sc =new Scanner(System.in);
        int id=sc.nextInt();
        for(int i=0;i<list.size();i++){
            if (list.get(i).getId()==id) {
                
                System.out.println("The student is "+list.get(i).getName());
            }
        }

        Student.RemoveById(list,4);//static method call by class name
        System.out.println(list);
    }
}
