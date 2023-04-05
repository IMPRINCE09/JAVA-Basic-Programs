public class sameOccurance {
    public static int start = -1;
    public static int end = -1;

    public static void FirstLastOccur(String str, int idx, char element) {

        if (idx == str.length()) {
            System.out.println(start);
            System.out.println(end);
            return;

        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (start == -1) {
                start = idx;
            } else {
                end = idx;
            }
            

        }
        FirstLastOccur(str, idx + 1, element);

    }

    public static void main(String args[]) {
        String str = "abcabbadab";
        FirstLastOccur(str, 0, 'a');

    }

}
