package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MidThree {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {8, 6, 7, 5, 3, 0, 9};
        int[] arr3 = {1, 2, 3};

        System.out.println(Arrays.toString(midThree(arr1)));
        System.out.println(Arrays.toString(midThree(arr2)));
        System.out.println(Arrays.toString(midThree(arr3)));
    }

    static int[] midThree(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
    }

}
