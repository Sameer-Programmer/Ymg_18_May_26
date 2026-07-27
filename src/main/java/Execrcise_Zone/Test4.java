package Execrcise_Zone;
import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {

        String s = "Sameerbhai";
        HashMap<Character, Integer> hm = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (hm.containsKey(ch)) {
                int count = hm.get(ch);
                count++;
                hm.put(ch, count);

            } else {
                hm.put(ch, 1);
            }

        }

        for (Character k : hm.keySet()) {
            System.out.println(k + "   " + hm.get(k));
        }
    }
}
