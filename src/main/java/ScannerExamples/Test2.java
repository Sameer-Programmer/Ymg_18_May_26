package ScannerExamples;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plese Enter your Name");
        String s1 = sc.next();
        System.out.println("hi yourName is Sameer "+s1);
        int age = sc.nextInt();
        System.out.println("your age is "+age);


    }
}
