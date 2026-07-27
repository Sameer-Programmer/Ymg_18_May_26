package Execrcise_Zone;

public class Test5 {
    public static void main(String[] args) {
        String s = "sameer bhai";
        String arr [] = s.split(" ");
        System.out.println(arr.length);

        for(String x : arr){
            char first = x.charAt(0);
            char ch = Character.toUpperCase(first);
            System.out.println(ch+x.substring(1));
        }


    }
}
