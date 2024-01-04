package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Has23 {

    public static void main(String[] args) {
        int[] arr1 = {2, 5};
        int[] arr2 = {4, 3};
        int[] arr3 = {4, 5};

        System.out.println(Arrays.toString(makeEnds(arr1)));
        System.out.println(Arrays.toString(makeEnds(arr2)));
        System.out.println(Arrays.toString(makeEnds(arr3)));
    }

    static boolean[] makeEnds(int[] nums) {
        return new boolean[]{nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3};
    }

}
