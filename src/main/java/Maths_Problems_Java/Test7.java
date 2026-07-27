package Maths_Problems_Java;
//gcd
// 10,20
/*
Yes. GCD and HCF mean the same thing. ✅

GCD = Greatest Common Divisor
HCF = Highest Common Factor
 */
public class Test7 {
    public  static void main(String[] args) {
        int a = 10;
        int b = 20;
        int gcd = 1;

        for(int i = 1 ; i<=a; i++){
            if(a%i ==0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        int lcm = (a*b)/gcd;
        System.out.println(lcm);
    }



}


