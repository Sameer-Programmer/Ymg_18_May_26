package PracticeZone;

public class Test12_ReverseNumber {
    public static void main(String[] args) {
        int num = 111;
        int originalNum = num;
        int lastDigit;
        int reverse =0;
        for( ; num>0;num= num/10){
           lastDigit = num%10;
           reverse = (reverse*10)+lastDigit;
            System.out.println(reverse);
        }
        System.out.println(reverse+"   "+"Reverse");
        System.out.println(originalNum+"  "+"OriginalNum");
        if(originalNum==reverse){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
