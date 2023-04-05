public class firstAndLastOcc {
    // find the occurance index of target element
    public static int start = -1;
    public static int end = -1;

    public static void Occur(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(start);
            System.out.println(end);
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (start == -1) {
                start = idx;
            } else {
                end = idx;
            }

        }
        Occur(str, idx + 1, element);

    }

    public static void main(String args[]) {
        String str = "abcbabac";
        Occur(str, 0, 'a');

    }
}
