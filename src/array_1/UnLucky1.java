package array_1;

import java.util.Arrays;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class UnLucky1 {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 1, 3, 4, 5};
        int[] arr3 = {1, 1, 1};

        System.out.println(Arrays.toString(new boolean[]{unlucky1(arr1)}));
        System.out.println(Arrays.toString(new boolean[]{unlucky1(arr2)}));
        System.out.println(Arrays.toString(new boolean[]{unlucky1(arr3)}));
    }

    static boolean unlucky1(int[] nums) {
        int arr = nums.length;
        if(arr > 2 && nums[0] == 1 && nums[1] == 3) return true;
        else if(arr >= 3 && nums[1] == 1 && nums[2] == 3) return true;
        else if(arr >= 2 &&  nums[arr -2] == 1 && nums[arr -1] == 3) return true;
        return false;
    }


}
