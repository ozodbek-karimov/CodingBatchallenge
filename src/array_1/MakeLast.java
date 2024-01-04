package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeLast {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6};
        int[] arr2 = {1, 2};
        int[] arr3 = {3};

        System.out.println(Arrays.toString(makeLast(arr1)));
        System.out.println(Arrays.toString(makeLast(arr2)));
        System.out.println(Arrays.toString(makeLast(arr3)));
    }

    static int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

}
