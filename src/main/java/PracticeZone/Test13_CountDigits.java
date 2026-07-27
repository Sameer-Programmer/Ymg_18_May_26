package PracticeZone;
// Count the digits

public class Test13_CountDigits {
    public static void main(String[] args) {
        int num = 1234500;
        int count = 0;
        for(;num>0;num = num/10){
            count ++;
        }
        System.out.println(count);
    }
}
