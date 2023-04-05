import java.util.*;

public class stingSubsequence {
    public static void subsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);

        subsequence(str, idx + 1, newString + currChar, set);
        subsequence(str, idx + 1, newString, set);

    }

    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        String str = "aaabbc";
        subsequence(str, 0, " ", set);
    }

}
