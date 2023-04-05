public class removeAllX {
    public static void moveAtend(String str, int idx, int count, char element, String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            count++;
            moveAtend(str, idx + 1, count, element, newString);
        } else {
            newString = newString + currChar;
            moveAtend(str, idx + 1, count, element, newString);
        }

    }

    public static void main(String args[]) {
        String str = "axbxcdexxx";
        moveAtend(str, 0, 0, 'x', " ");
        System.out.println();
    }

}
