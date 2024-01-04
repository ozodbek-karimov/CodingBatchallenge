package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MaxTriple {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 5, 3};
        int[] arr3 = {5, 2, 3};

        System.out.println(Arrays.toString(new int[]{maxEnd3(arr1)}));
        System.out.println(Arrays.toString(new int[]{maxEnd3(arr2)}));
        System.out.println(Arrays.toString(new int[]{maxEnd3(arr3)}));
    }

    static int maxEnd3(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        return Math.max(Math.max(first, middle), last);
    }


}
