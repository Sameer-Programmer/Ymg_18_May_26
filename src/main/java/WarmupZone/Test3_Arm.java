package WarmupZone;

public class Test3_Arm {
    public static void main(String[] args) {
        int num = 153 ;
        int lastDigit;
        int result = 0;

        for(num = 153;num>0;num = num/10){
            lastDigit = num%10;
            result = result+(lastDigit*lastDigit*lastDigit);
        }
        System.out.println(result);
    }
}
