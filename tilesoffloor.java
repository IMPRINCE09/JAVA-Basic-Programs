public class tilesoffloor {
    public static int placement(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int vertical = placement(n - m, m);
        int horizontal = placement(n - 1, m);

        return vertical + horizontal;
    }

    public static void main(String args[] ){
        int n = 2, m = 3;
        System.out.println(placement(m, n));
    }

}
