

import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        System.out.println("Enter the no. of subarrays");
        Scanner scan=new Scanner(System.in);
        int numberOfsubarray=scan.nextInt();
        int [][]jagged=new int[numberOfsubarray][];

        for (int i=0;i<numberOfsubarray;i++){
            System.out.println("Enter the size of sub-Array "+ i +":");
            jagged[i] =new int [scan.nextInt()];
            System.out.println("Enter the elements of subArray "+i+":");
            for(int j =0;j<jagged[i].length;j++){
                jagged[i][j] = scan.nextInt();
            }
        }

         System.out.println("The jagged array is:");
        for (int i = 0; i < numberOfsubarray; i++) {
            
          	for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
