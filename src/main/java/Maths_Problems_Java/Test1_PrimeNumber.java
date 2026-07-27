package Maths_Problems_Java;
//Prime NUmber check

public class Test1_PrimeNumber {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;
        for(int i = 1; i<=num;i++){
            if(num%i == 0){
                count++;
            }

        }

        if(count ==2){
            System.out.println("primeNmber");
        }else {
            System.out.println("Not primeNmber");
        }


    }
}
