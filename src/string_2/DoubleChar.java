package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class DoubleChar {


    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
    }

    static String doubleChar(String str) {
        StringBuilder blr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            blr.append(str.charAt(i)).append(str.charAt(i));
        }

        return blr.toString();
    }

}
