package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Start1 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr1_2 = {1,3};
        int[] arr2 = {7, 2, 3};
        int[] arr2_2 = {1};
        int[] arr3 = {1,2};
        int[] arr3_3 = {};

        System.out.println(Arrays.toString(new int[]{start1(arr1, arr1_2)}));
        System.out.println(Arrays.toString(new int[]{start1(arr2, arr2_2)}));
        System.out.println(Arrays.toString(new int[]{start1(arr3, arr3_3)}));
    }

    static int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length >= 1 && a[0] == 1){
            count++;
        }

        if (b.length >= 1 && b[0] == 1){
            count++;
        }

        return count;
    }

}
