package PracticeZone_Strings;

public class Test33 {
    public static void main(String[] args) {
        String s1 = "mohammed sameer";
        String arr [] = s1.split(" ");

        for(String x:arr){
         char ch =   x.charAt(0);
         char first = Character.toUpperCase(ch);
            System.out.print(first+x.substring(1)+" ");
        }
    }
}
