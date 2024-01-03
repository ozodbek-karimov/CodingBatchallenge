package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ComboString {

    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
        System.out.println(comboString("hi", "Hello"));
        System.out.println(comboString("aaa", "b"));
    }


    static String comboString(String a, String b) {
        return          a.isEmpty() ? b
                        : b.isEmpty() ? a
                        : a.length() > b.length() ? b + a + b
                        : a + b + a;
    }
}
