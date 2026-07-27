package PracticeArrayConcepts;

public class Demo007 {
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,7,8,9,10};
        int sum =0;
        for(int x :arr){
           sum = sum +x;
        }
        int expectedSum = 10*(10+1)/2;
        System.out.println(expectedSum+"     ExpectedSum");
        int missingNumner = expectedSum - sum;
        System.out.println(missingNumner);
    }
}
