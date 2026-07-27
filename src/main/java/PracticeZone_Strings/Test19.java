package PracticeZone_Strings;

public class Test19 {
    public static void main(String[] args) {
        // Input:  "Today is a good day"
        // Output: "day doog a si Today"

        String s1 = "Today is a good day";
        String reverse = "";
        String[] arr = s1.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == 0) {
                // First word: keep as-is
                reverse = reverse + arr[i];
            } else {
                // All other words: reverse their characters
                reverse =
                        reverse + new StringBuilder(arr[i]).reverse().toString() + " ";
            }
        }

        System.out.println(reverse);
    }
}