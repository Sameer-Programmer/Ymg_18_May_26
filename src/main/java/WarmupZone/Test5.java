package WarmupZone;

public class Test5 {
    public static void main(String[] args) {
        //PrimeNumbers

        for(int i = 1; i<=100; i++){
            int count =0;
            for(int num = 1; num<i; num++){
                if(i%num==0){
                count++;
                }
            }

            if(count==1){
                System.out.println(i);
            }
        }



    }
}
