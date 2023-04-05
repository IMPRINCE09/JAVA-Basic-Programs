public class arrayissorted {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] arg) {
        int arr[] = { 6, 7, 8, 9, 10 };
        System.out.println(isSorted(arr, 0));
    }
}
