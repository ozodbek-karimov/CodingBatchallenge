package array_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FirstLast6 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 6};
        int[] arr2 = {6, 1, 2, 3};
        int[] arr3 = {13, 6, 1, 2, 3};

        System.out.println(firstLast6(arr1));
        System.out.println(firstLast6(arr2));
        System.out.println(firstLast6(arr3));
    }

    static boolean firstLast6(int[] nums) {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

}
