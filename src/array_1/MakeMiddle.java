package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeMiddle {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {7, 1, 2, 3, 4, 9};
        int[] arr3 = {1, 2};

        System.out.println(Arrays.toString(makeMiddle(arr1)));
        System.out.println(Arrays.toString(makeMiddle(arr2)));
        System.out.println(Arrays.toString(makeMiddle(arr3)));
    }

    static int[] makeMiddle(int[] nums) {
        return nums.length > 2 ? new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]} : nums;
    }

}
