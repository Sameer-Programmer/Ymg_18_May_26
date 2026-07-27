package PracticeArrayConcepts;

public class SumArray {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,0};


        for(int x :arr){
            int count =0;
            for(int i = 1 ; i<x; i++){
                if(x%i==0){
                    count++;
                }
            }
            if(count ==1){
                System.out.println(x+"  primeNumber");
            }

        }

    }
}
