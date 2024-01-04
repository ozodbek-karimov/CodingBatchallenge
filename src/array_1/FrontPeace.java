package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FrontPeace {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {1};

        System.out.println(Arrays.toString(frontPiece(arr1)));
        System.out.println(Arrays.toString(frontPiece(arr2)));
        System.out.println(Arrays.toString(frontPiece(arr3)));
    }

    static int[] frontPiece(int[] nums) {
       return nums.length <= 2 ? nums : new int[] {nums[0], nums[1]};
    }

}
