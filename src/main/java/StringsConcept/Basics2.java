package StringsConcept;
/*
Substring - startIndex Starts form zero
Substring - endIndex - startIndex+1
 s3.substring(0,5); //  Starting Index and endin Index
 we can provide only Starting Index as well
 */
public class Basics2 {
  public  static void main(String[] args){
        String s1 = "Sameer";
        String s2 = s1.substring(0,4); //same
        System.out.println(s2);

        String s3 = "Today is a good day";

        String s4 = s3.substring(0,5); // s4 = Today
        System.out.println(s4);
        System.out.println(s3.indexOf("is"));
        String s5 = s3.substring(6);
        System.out.println(s5);



    }
}
