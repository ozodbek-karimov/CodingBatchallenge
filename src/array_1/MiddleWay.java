package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MiddleWay {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr1_2 = {4, 5, 6};
        int[] arr2 = {7, 7, 7};
        int[] arr2_2 = {3, 8, 0};
        int[] arr3 = {5, 2, 9};
        int[] arr3_3 = {1, 4, 5};

        System.out.println(Arrays.toString(middleWay(arr1, arr1_2)));
        System.out.println(Arrays.toString(middleWay(arr2, arr2_2)));
        System.out.println(Arrays.toString(middleWay(arr3, arr3_3)));
    }

    static int[] middleWay(int[] a, int[] b) {
        /**

         return new int[]{a[1], b[1]};

         * */
        return new int[]{a[a.length/2], b[b.length/2]};
    }

}
