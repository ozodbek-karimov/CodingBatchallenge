package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Fix23 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 5};
        int[] arr3 = {1, 2, 1};

        System.out.println(Arrays.toString(fix23(arr1)));
        System.out.println(Arrays.toString(fix23(arr2)));
        System.out.println(Arrays.toString(fix23(arr3)));
    }

    static int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            return new int[]{nums[0], nums[1] = 0, nums[2]};
        } else if (nums[1] == 2 && nums[2] == 3) {
            return new int[]{nums[0], nums[1], nums[2] = 0};
        }
        return nums;
    }


}
