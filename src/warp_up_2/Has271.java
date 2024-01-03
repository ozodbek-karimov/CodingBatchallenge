package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Has271 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 7, 1};
        int[] arr2 = {1, 2, 8, 1};
        int[] arr3 = {2, 7, 1};

        System.out.println(has271(arr1));
        System.out.println(has271(arr2));
        System.out.println(has271(arr3));
    }

    static boolean has271(int[] nums) {

        for (int viewer = 0; viewer < nums.length - 2; viewer++) {
            int val = nums[viewer];
            int valPlus5 = val + 5;
            int valMinus1 = val - 1;

            if (nums[viewer + 1] == valPlus5 && Math.abs(nums[viewer + 2] - valMinus1) <= 2) {
                return true;
            }
        }
        return false;
    }

}
