package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Array123 {


    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2, 3, 1};
        int[] arr2 = {1, 1, 2, 4, 1};
        int[] arr3 = {1, 1, 2, 1, 2, 3};

        System.out.println(array123(arr1));
        System.out.println(array123(arr2));
        System.out.println(array123(arr3));
    }

    static boolean array123(int[] nums) {

        for (int viewer = 0; viewer < nums.length - 2; viewer++){
            if (nums[viewer] == 1 && nums[viewer+1] == 2 && nums[viewer+2] == 3){
                return true;
            }
        }

        return false;
    }

}
