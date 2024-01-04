package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class DeFront {

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    static String deFront(String str) {
        if (str.length() >= 2) {
            if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
                return str;
            } else if (str.charAt(0) == 'a') {
                return "a" + str.substring(2);
            } else if (str.charAt(1) == 'b') {
                return "b" + str.substring(2);
            } else {
                return str.substring(2);
            }
        } else if (str.length() == 1 && str.charAt(0) == 'a') {
            return "a";
        } else {
            return "";
        }
    }

}
