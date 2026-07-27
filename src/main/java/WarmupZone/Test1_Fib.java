package WarmupZone;

public class Test1_Fib {
    public static void main(String[] args) {
       //Fibonacci Series
        //0,1,1,2,3,
        //    0,1,2
        int a =0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i<3;i++){
            int temp = a+b;
            System.out.println(temp); //1
            a=b; // 1
               b=temp;  // 1

        }


    }
}
