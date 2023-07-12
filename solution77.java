
import java.io.*;
public class solution77 {
        public static String removeBackspaces(String s) {
            int n = s.length();
            int idx = 0;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != '#') {
                    s = s.substring(0, idx) + s.charAt(i) + s.substring(idx + 1);
                    idx++;
                }
                else if (s.charAt(i) == '#' && idx >= 0) {
                    idx--;
                }
                if (idx < 0)
                    idx = 0;
            }

            return s.substring(0, idx);
        }

        // Driver code
        public static void main(String[] args) {
            // initialise two strings
            String s = "ab#c";
            String t = "ad#c";

            if (removeBackspaces(s).equals(removeBackspaces(t)))
                System.out.println("True");
            else
                System.out.println("False");
        }

}
