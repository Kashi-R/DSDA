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

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Student{id=" + id + ", name='" + name + "'}";
}

}
public class Problem {
    public static void main(String[] args) {
        
        ArrayList<Student> st = new ArrayList<>();
        st.add(0,new Student(1, "Kashi"));//adding by index
        st.add(new Student(2,"Kedar"));//first added i.e index 0
        st.add(new Student(3,"Bibek"));
        st.add(new Student(4,"Nagen"));
        st.add(new Student(5,"Khageswar"));
        st.add(new Student(6,"Jitu"));

        
        for (Student X : st) {//for each loop (int X : arr)
            System.out.println(X);
        }

        //to access a particular student info we have to use getter setter method
        Student I3 = st.get(3);
        System.out.println(I3.getName());
    }
}
