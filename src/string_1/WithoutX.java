package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class WithoutX {

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    static String withoutX(String str) {
        if (!str.isEmpty() && str.charAt(0) == 'x') {
            str = str.substring(1);
        }

        if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

}
