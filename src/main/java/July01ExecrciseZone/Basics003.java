package July01ExecrciseZone;

public class Basics003 {
    public static void main(String[] args){
        int year = 2024; // BMS
        if(year%400 == 0){
            System.out.println("LeapYear");
        } else if (year%100 == 0) {
            System.out.println("Not a LeapYear");
        } else if (year%4==0) {
            System.out.println("LeapYear");
        }else {
            System.out.println("Not a LeapYear");
        }
    }
}
