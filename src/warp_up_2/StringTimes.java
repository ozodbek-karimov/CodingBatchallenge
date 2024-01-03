package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringTimes {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hey Man", 2));
    }

    static String stringTimes(String str, int n) {

        StringBuilder blr = new StringBuilder();

        for (int viewer = 0; viewer < n; viewer++){
            blr.append(str);
        }

        return blr.toString();
    }
}
