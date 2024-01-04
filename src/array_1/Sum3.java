package array_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Sum3 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {5, 11, 2};
        int[] arr3 = {7, 0, 0};

        System.out.println(sum3(arr1));
        System.out.println(sum3(arr2));
        System.out.println(sum3(arr3));
    }

    static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

}
