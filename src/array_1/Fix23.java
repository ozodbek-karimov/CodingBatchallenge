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

        System.out.println(Arrays.toString(firstLast6(arr1)));
        System.out.println(Arrays.toString(firstLast6(arr2)));
        System.out.println(Arrays.toString(firstLast6(arr3)));
    }

    static int[] firstLast6(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }

}
