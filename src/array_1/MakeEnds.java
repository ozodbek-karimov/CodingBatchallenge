package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeEnds {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {7, 4, 6, 2};

        System.out.println(Arrays.toString(Reverse3(arr1)));
        System.out.println(Arrays.toString(Reverse3(arr2)));
        System.out.println(Arrays.toString(Reverse3(arr3)));
    }

    static int[] Reverse3(int[] nums) {
                return nums.length == 1
                ?
                new int[] {nums[0], nums[0]}
                :
                new int[]{nums[0], nums[nums.length - 1]};
    }

}
