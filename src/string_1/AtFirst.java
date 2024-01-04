package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class AtFirst {

    public static void main(String[] args) {
        System.out.println(atFirst("hello"));
        System.out.println(atFirst("hi"));
        System.out.println(atFirst("h"));
    }


    static String atFirst(String str) {
        return str.length() >= 2 ? str.substring(0, 2) : str.length() == 1 ? str + "@" : "@@";
    }
}
