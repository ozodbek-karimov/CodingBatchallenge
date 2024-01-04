package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class WithoutEnd2 {

    public static void main(String[] args) {
        System.out.println(withouEnd2("Hello"));
        System.out.println(withouEnd2("abc"));
        System.out.println(withouEnd2("ab"));
    }

    static String withouEnd2(String str) {
        return str.length() <= 2 ? "" : str.substring(1, str.length()-1);
    }

}
