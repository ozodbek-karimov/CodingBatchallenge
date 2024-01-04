package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class LastChars {

    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    static String lastChars(String a, String b) {
        return String.valueOf(a.isEmpty() ? '@' : a.charAt(0)) + (b.isEmpty() ? '@' : b.charAt(b.length() - 1));
    }


}
