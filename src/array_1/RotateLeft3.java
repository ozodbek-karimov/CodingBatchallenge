package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class RotateLeft3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 11, 9};
        int[] arr3 = {7, 0, 0};

        System.out.println(Arrays.toString(rotateLeft3(arr1)));
        System.out.println(Arrays.toString(rotateLeft3(arr2)));
        System.out.println(Arrays.toString(rotateLeft3(arr3)));
    }

    static int[] rotateLeft3(int[] nums) {
        return new int[]{ nums[1],nums[2],nums[0] };
    }

}
