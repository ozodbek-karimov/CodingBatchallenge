package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Make2 {

    public static void main(String[] args) {
        int[] arr1 = {4, 5};
        int[] arr1_2 = {1, 2, 3};
        int[] arr2 = {4};
        int[] arr2_2 = {1, 2, 3};
        int[] arr3 = {};
        int[] arr3_3 = {1, 2};

        System.out.println(Arrays.toString(make2(arr1, arr1_2)));
        System.out.println(Arrays.toString(make2(arr2, arr2_2)));
        System.out.println(Arrays.toString(make2(arr3, arr3_3)));
    }

    static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];

        if (a.length >= 2) {
            result[0] = a[0];
            result[1] = a[1];
        } else if (a.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        } else if (b.length >= 2) {
            result[0] = b[0];
            result[1] = b[1];
        } else if (b.length == 1) {
            result[0] = a[0];
            result[1] = b[0];
        }

        return result;
    }


}
