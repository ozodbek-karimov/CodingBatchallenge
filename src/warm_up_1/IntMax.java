package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class IntMax {

    public static void main(String[] args) {
        System.out.println(intMax(3, 2, 1));
        System.out.println(intMax(2, 5, 8));
    }

    static int intMax(int a, int b, int c) {
        return Math.max((Math.max(a, b)), c);
    }

}
