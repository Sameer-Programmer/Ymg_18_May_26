package PracticeArrayConcepts;

public class Demo006 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,56,7,8,9,0};
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i]; //0<1=true
            }

            if(arr[i]>min){
                max = arr[i]; //0<1=true
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
