package PracticeZone_Strings;

import java.util.*;

public class Test3_RemoveDuplicates {
   public static <charArray> void main(String[] args) {
       String input = "aabbeccdabc";
       char [] arr = input.toCharArray();

       for(int i =0; i< arr.length;i++){
           boolean alreadyPrcessed = false;
           for(int k =0; k<i; k++){
               if(arr[i]==arr[k]){
                   alreadyPrcessed = true;
                   break;
               }
           }
           if(alreadyPrcessed) continue;
           int count =0;
           for(int j =0; j< arr.length;j++){
              if(arr[i] == arr[j]) {
                  count++;
              }


           }
          // System.out.println(arr[i]+":"+count);
           if(count ==1){
               System.out.println("unique");
               System.out.println(arr[i]);
               break;
           }
       }
    }
}
