package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Double23 {

    public static void main(String[] args) {
        int[] arr1 = {2, 2};
        int[] arr2 = {3, 3};
        int[] arr3 = {2, 3};

        System.out.println(Arrays.toString(makeLast(arr1)));
        System.out.println(Arrays.toString(makeLast(arr2)));
        System.out.println(Arrays.toString(makeLast(arr3)));
    }

    static boolean[] makeLast(int[] nums) {
        return new boolean[]{nums.length == 2 && (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3)};
    }

}
