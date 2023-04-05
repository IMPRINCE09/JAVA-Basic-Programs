public class factorial {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1; // return 0,1;
        }
        int ans = n * fact(n - 1); // int ans =fibo(n-2)+fibo(n-1);
        return ans;
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.print(fact(n));

    }
}
