package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ArrayCount9 {

    public static void main(String[] args) {

        int[] arr1 = {1,3,9};
        int[] arr2 = {1,9,9};
        int[] arr3 = {1, 9, 9, 3, 9};

        System.out.println(arrayCount9(arr1));
        System.out.println(arrayCount9(arr2));
        System.out.println(arrayCount9(arr3));
    }

    static int arrayCount9(int[] nums) {

        int count = 0;
        for (int viewer : nums){
            if (viewer == 9){
                count++;
            }
        }
        return count;
    }
}
