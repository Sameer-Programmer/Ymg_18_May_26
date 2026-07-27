package PracticeZone_Strings;

public class Test14 {
    static void main(String[] args) {
        String s1 = "Hello world";
        String [] words = s1.split(" ");
        for(String word:words){
            System.out.println(
                  word.substring(0,1).toUpperCase()
                  +word.substring(1)
                          +" "
            );
        }

    }
}
// this Part i am not getting +word.substring(1)