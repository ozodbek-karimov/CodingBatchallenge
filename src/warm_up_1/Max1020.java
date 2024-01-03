package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Max1020 {

    public static void main(String[] args) {
        System.out.println(max1020(11, 9));
    }
    static int max1020(int a, int b) {
        boolean aInRange = a >= 10 && a <= 20;
        boolean bInRange = b >= 10 && b <= 20;

        if (aInRange && bInRange) {
            return Math.max(a, b);
        } else if (aInRange) {
            return a;
        } else if (bInRange) {
            return b;
        } else {
            return 0;
        }
    }

}
