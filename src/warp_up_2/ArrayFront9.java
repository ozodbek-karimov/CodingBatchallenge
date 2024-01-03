package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ArrayFront9 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 9, 3, 4};
        int[] arr2 = {1, 2, 3, 4, 9};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(arrayFront9(arr1));
        System.out.println(arrayFront9(arr2));
        System.out.println(arrayFront9(arr3));
    }

    static boolean arrayFront9(int[] nums) {

        for (int viewer = 0; viewer < Math.min(nums.length, 4); viewer++){
            if (nums[viewer] == 9){
                return true;
            }
        }

        return false;
    }

}
