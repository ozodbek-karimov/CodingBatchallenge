package array_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class CommonEnd {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr1_2 = {7, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr2_2 = {7, 3, 2};
        int[] arr3 = {1, 2, 1};
        int[] arr3_3 = {1, 3};

        System.out.println(commonEnd(arr1, arr1_2));
        System.out.println(commonEnd(arr2, arr2_2));
        System.out.println(commonEnd(arr3, arr3_3));
    }

    static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

}
