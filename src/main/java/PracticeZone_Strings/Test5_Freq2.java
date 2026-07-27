package PracticeZone_Strings;

public class Test5_Freq2 {
   public static void main(String[] args) {
        String input = "aabbccdda";
        char[] arr =  input.toCharArray();
        int count = 1;
        for(int i =0; i< arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else {
                System.out.println(arr[i]+":"+count);
                count =1;
            }
        }
        System.out.println(arr[arr.length-1]+":"+count);
    }
}
