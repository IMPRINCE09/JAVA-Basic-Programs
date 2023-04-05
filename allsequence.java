public class allsequence {
    public static void printpermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);

        }

        for (int i = 0; i < str.length(); i++) {
            char currchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newstr, permutation + currchar);
        }

    }

    public static void main(String [] args){
        String str ="abc";
        printpermutation(str,"");
        
    }
}
