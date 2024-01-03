package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class NearHundred {

    public static void main(String[] args) {

        System.out.println(nearHundred(90));
    }

    static boolean nearHundred(int n) {
        return (Math.abs(n - 100) <= 10) || (Math.abs(n - 200) <= 10);
    }

}
