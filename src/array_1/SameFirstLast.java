package array_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SameFirstLast {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3, 1};
        int[] arr3 = {1, 2, 1};

        System.out.println(sameFirstLast(arr1));
        System.out.println(sameFirstLast(arr2));
        System.out.println(sameFirstLast(arr3));
    }

    static boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

}
