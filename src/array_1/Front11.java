package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Front11 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr1_2 = {7, 8, 9};
        int[] arr2 = {1};
        int[] arr2_2 = {2};
        int[] arr3 = {1, 7};
        int[] arr3_3 = {};

        System.out.println(Arrays.toString(front11(arr1, arr1_2)));
        System.out.println(Arrays.toString(front11(arr2, arr2_2)));
        System.out.println(Arrays.toString(front11(arr3, arr3_3)));
    }

    static int[] front11(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length >= 1) {
            return new int[]{a[0]};
        } else if (b.length >= 1) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }
}
