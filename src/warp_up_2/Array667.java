package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Array667 {

    public static void main(String[] args) {
        int[] arr1 = {6, 6, 2};
        int[] arr2 = {6, 6, 2, 6};
        int[] arr3 = {6, 7, 2, 6};

        System.out.println(array667(arr1));
        System.out.println(array667(arr2));
        System.out.println(array667(arr3));
    }

    static int array667(int[] nums) {

        int count = 0;

        for (int viewer = 0; viewer < nums.length-1; viewer++){
            if (nums[viewer] == 6 && (nums[viewer+1] == 6 || nums[viewer+1] == 7)){
                count++;
            }
        }

        return count;

    }

}
