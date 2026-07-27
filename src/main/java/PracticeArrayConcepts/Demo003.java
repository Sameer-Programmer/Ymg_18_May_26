package PracticeArrayConcepts;

public class Demo003 {
    public static void main(String[] args) {
        int arr [][] = {
                {1,2},
                {3,4},
                {5,6}
        };
        System.out.println(arr.length);//rows
        System.out.println(arr[0].length); //columns

        for(int i = 0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }


}
