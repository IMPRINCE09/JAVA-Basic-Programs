import java.util.*;

public class numberispositive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("negative " + n);
        } else if (n == 0) {

            System.out.println("zero" + n);
        } else {
            System.out.println("positive" + n);
        }
        {
            sc.close();
        }
    }

}
