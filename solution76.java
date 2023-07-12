
import java.io.*;
import java.util.*;

public class solution76 {
        static boolean checkString(String s1, String s2,
                                   int indexFound, int Size)
        {
            for (int i = 0; i < Size; i++) {
                if (s1.charAt(i)
                        != s2.charAt((indexFound + i) % Size))
                    return false;
            }
            return true;
        }
        public static void main(String args[])
        {
            String s1 = "abcd";
            String s2 = "cdab";

            if (s1.length() != s2.length()) {
                System.out.println(
                        "s2 is not a rotation on s1");
            }
            else {

                ArrayList<Integer> indexes = new ArrayList<
                        Integer>();

                int Size = s1.length();

                char firstChar = s1.charAt(0);

                for (int i = 0; i < Size; i++) {
                    if (s2.charAt(i) == firstChar) {
                        indexes.add(i);
                    }
                }

                boolean isRotation = false;
                for (int idx : indexes) {
                    isRotation = checkString(s1, s2, idx, Size);

                    if (isRotation)
                        break;
                }

                if (isRotation)
                    System.out.println(
                            "true");
                else
                    System.out.println(
                            "false");
            }
        }
    }
