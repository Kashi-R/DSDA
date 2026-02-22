public class jaggedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[5];
        arr[1] = new int[4];
        arr[2] = new int[2];
        // intitialization
        arr[0][0] = 0;
        arr[0][1] = 6;
        arr[0][2] = 3;
        // so on....
        arr[2][1] = 2;

        int arra[][] = new int[][] {
                new int[] { 1, 2, 3, 4 },
                new int[] { 2, 3, 4 },
                new int[] { 3, 4, 5, 6, 7, 8 }
        };
        int[][] array = { new int[] { 1, 2, 3, 4 },
                          new int[] { 2, 3, 4 },
                          new int[] { 3, 4, 5, 6, 7, 8 }
        };
        int [][]arrayj= {
                          {1,2,3,4},{2,3,4},{3,4,5,6,7,8}
                        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arrayj[i].length;j++){
                System.out.print(arrayj[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
