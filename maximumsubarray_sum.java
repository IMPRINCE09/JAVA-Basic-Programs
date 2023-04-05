import java.util.*;

//find the maximum sub array sum  of array
public class maximumsubarray_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // int arr[] = { 4, -2, -3, 4, -1, -2, 1, 5, -3 };

        int ans = maxsum(arr);

        System.out.println("maximun sum " + ans);

    }

    public static int maxsum(int arr[]) {
        int max_ending_sofar = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + arr[i];

            if (max_ending_sofar < max_ending_here) {
                max_ending_sofar = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_ending_sofar;

    }
}
