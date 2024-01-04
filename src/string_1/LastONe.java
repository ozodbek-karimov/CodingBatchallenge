package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class LastONe {

    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }

    static String lastTwo(String str) {
        return          str.length() > 1 ?
                        str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2)
                        : str;
    }


}
