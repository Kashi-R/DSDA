import java.util.Arrays;

public class Insertion {

    public static int[] InsertionFirst(int element, int[] arr) {
        if (arr[arr.length - 1] == 0) {
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];// shifting
            }
            arr[0] = element;
        } else {
            System.out.println("array is full so we have created new array");
            int[] newArr = new int[arr.length + 1];

            // Put new element at index 0
            newArr[0] = element;

            // Copy old elements
            for (int i = 0; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        }
        return arr;
    }
    

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        System.out.println(Arrays.toString(InsertionFirst(1, arr)));
        
    }
}
