import java.util.*;

public class towerofhanio {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanio(n, "s", "h", "d");
        {
            sc.close();
        }
    }

    public static void hanio(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        hanio(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        hanio(n - 1, helper, src, dest);

    }
}
