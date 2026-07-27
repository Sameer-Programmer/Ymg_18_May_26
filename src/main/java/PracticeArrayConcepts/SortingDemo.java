package PracticeArrayConcepts;

public class SortingDemo {
    public static void main(String[] args) {
        int arr [] = {11,2,6,3,2,1,0};

        for(int i = 0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int x : arr){
            System.out.println(x);
        }
        System.out.println(arr[arr.length-2]);




    }
}
