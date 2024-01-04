package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class BiggerTwo {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr1_2 = {3, 4};
        int[] arr2 = {3, 4};
        int[] arr2_2 = {1, 2};
        int[] arr3 = {1, 1};
        int[] arr3_3 = {1, 2};

        System.out.println(Arrays.toString(biggerTwo(arr1, arr1_2)));
        System.out.println(Arrays.toString(biggerTwo(arr2, arr2_2)));
        System.out.println(Arrays.toString(biggerTwo(arr3, arr3_3)));
    }

    static int[] biggerTwo(int[] a, int[] b) {
        return a[0] + a[1] > b[0] + b[1] || a[0] + a[1] == b[0] + b[1] ? a : b;
    }

}
