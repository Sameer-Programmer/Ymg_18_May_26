package PracticeArrayConcepts;

/*
What I have covered
-Declare an Array
-Add Values in a Array
- Find Size of an Array
- Read single element from a Array
- Read Multiple Values in a Array
 */


public class Demo001 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        System.out.println(arr.length);
        System.out.println(arr[0]);
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

        for(int x :arr){
            System.out.println(x);
        }
    }
}
