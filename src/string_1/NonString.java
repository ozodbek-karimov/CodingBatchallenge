package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class NonString {

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }


    static String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);
    }
}
