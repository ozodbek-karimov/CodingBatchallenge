package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class No23 {

    public static void main(String[] args) {
        int[] arr1 = {4, 5};
        int[] arr2 = {4, 2};
        int[] arr3 = {3, 5};

        System.out.println(Arrays.toString(no23(arr1)));
        System.out.println(Arrays.toString(no23(arr2)));
        System.out.println(Arrays.toString(no23(arr3)));
    }

    static boolean[] no23(int[] nums) {
        return new boolean[]{nums[0] != 2 && nums[1] != 2 && nums[0] != 3 && nums[1] != 3};
    }

}
