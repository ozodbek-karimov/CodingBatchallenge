package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class WithoutEnd {

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
    }


    static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

}
