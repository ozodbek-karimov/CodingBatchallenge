package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Sum2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 1};
        int[] arr3 = {1, 1, 1};

        System.out.println(Arrays.toString(sum2(arr1)));
        System.out.println(Arrays.toString(sum2(arr2)));
        System.out.println(Arrays.toString(sum2(arr3)));
    }

    static int[] sum2(int[] nums) {
        /**

         if (nums.length  < 2) {
         return nums;
         }else {
         return new int[]{nums[0] + nums[1]};
         }
         */

        return nums.length < 2 ? nums : new int[]{nums[0] + nums[1]};
    }

}
