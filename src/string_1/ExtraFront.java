package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ExtraFront {

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
    }

    static String extraFront(String str) {
        return str.length() <= 2 ? str + str + str : str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }

}
