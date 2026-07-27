package Execrcise_Zone;

import java.util.*;
public class  Test28 {
	public static void main(String[] args){
		//Frequency
		String s = "aabbccd";
		for(int i =0; i<s.length(); i++){
			char ch = s.charAt(i);
			int count = 0;
			for(int j =0; j<s.length(); j++){
			if(s.charAt(j)==ch){
				count = count+1;
			}
            }
			
			if(count==1){
				System.out.println(ch);
				break;
			}
		}

	}
}