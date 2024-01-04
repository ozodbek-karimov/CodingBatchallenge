package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class WithoutX2 {

    public static void main(String[] args) {
        System.out.println(withoutX2("xxHi"));
        System.out.println(withoutX2("x"));
        System.out.println(withoutX2("Hi"));
    }

    static String withoutX2(String str) {

        if (!str.isEmpty() && str.length() >= 2 && str.charAt(0) == 'x' && str.charAt(1) == 'x') {
            str = str.substring(2);
        } else if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1);
        } else if (!str.isEmpty() && str.length() >= 2&& str.charAt(1) == 'x') {
            str = str.charAt(0) + str.substring(2);
        }


        return str;
    }

}
