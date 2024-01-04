package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SwapEnds {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {8, 6, 7, 9, 5};

        System.out.println(Arrays.toString(swapEnds(arr1)));
        System.out.println(Arrays.toString(swapEnds(arr2)));
        System.out.println(Arrays.toString(swapEnds(arr3)));
    }

    static int[] swapEnds(int[] nums) {
       int temp = nums[0];
       nums[0] = nums[nums.length-1];
       nums[nums.length-1] = temp;
       return nums;
    }

}
