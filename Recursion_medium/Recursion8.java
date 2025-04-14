//print all the unique subsequences of a string of a sequence
import java.util.*;

public class Recursion8 {
    public static void subsequence(String str, int index, String newString, HashSet<String> set) {
        // Time complexity = O(2^n)
        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currChar = str.charAt(index);

        // to be
        subsequence(str, index + 1, newString + currChar, set);

        // or not to be
        subsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
}

/* op
aaa
aa
a
*/