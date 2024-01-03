package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class IcyHot {

    public static void main(String[] args) {
        System.out.println(icyHot(-1, 120));
    }

    static boolean icyHot(int temp1, int temp2) {

        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

}
