package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class NoTriples {

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2,};
        int[] arr2 = {1, 1, 2, 2, 2, 1};
        int[] arr3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(arr1));
        System.out.println(noTriples(arr2));
        System.out.println(noTriples(arr3));

    }

    static boolean noTriples(int[] nums) {

        for (int viewer = 0; viewer < nums.length-2; viewer++) {
            if ((nums[viewer] == nums[viewer + 1]) && (nums[viewer+1] == nums[viewer+2])){
                return false;
            }
        }

        return true;
    }

}
