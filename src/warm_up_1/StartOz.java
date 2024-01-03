package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StartOz {

    public static void main(String[] args) {
        System.out.println(startOz("bzoo"));
    }

    static String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += 'o';
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += 'z';
        }

        return result;
    }

}
