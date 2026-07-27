package StringsConcept;

/*
SplitMethod - we can split based on the Charater it will retun a Array
 */

public class Basics3_Split {
    static void main(String[] args){
        String s1 = "sameeridea7@gmail.com";
        String[] arr = s1.split("@");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
