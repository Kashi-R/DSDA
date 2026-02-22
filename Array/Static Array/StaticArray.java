//it is static array
import java.util.Arrays;

public class StaticArray {
    
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            //Time Complexity O(n)
            //we can accessing elment by arr[i]
        }
        System.out.println(Arrays.toString(arr));
        //Time Complexity O(n)--convert to string by 
        // visiting each element

        int [] kar= new int[3];
        kar[0]=10;
        kar[1]=2;
        kar[2]=5;
        // kar[4]=22; out of bound
        
        String [] arrOfName = {"Kashi","Bibek"};
        System.out.println(Arrays.toString(arrOfName));
        
    }
}
