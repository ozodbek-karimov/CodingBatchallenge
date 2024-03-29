package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MaxEnd3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {11, 5, 9};
        int[] arr3 = {2, 11, 3};

        System.out.println(Arrays.toString(maxEnd3(arr1)));
        System.out.println(Arrays.toString(maxEnd3(arr2)));
        System.out.println(Arrays.toString(maxEnd3(arr3)));
    }

    static int[] maxEnd3(int[] nums) {
        nums[0] = Math.max(nums[0], nums[2]);
        nums[1] = nums[0];
        nums[2] = nums[0];
        return nums;
    }

}
