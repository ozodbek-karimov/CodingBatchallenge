package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class PlusTwo {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr1_2 = {3, 4};
        int[] arr2 = {4, 4};
        int[] arr2_2 = {2, 2};
        int[] arr3 = {9, 2};
        int[] arr3_3 = {3, 4};

        System.out.println(Arrays.toString(plusTwo(arr1, arr1_2)));
        System.out.println(Arrays.toString(plusTwo(arr2, arr2_2)));
        System.out.println(Arrays.toString(plusTwo(arr3, arr3_3)));
    }

    static int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0],a[1],b[0],b[1]};
    }

}
