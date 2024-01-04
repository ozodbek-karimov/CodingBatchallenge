package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FrontAgain {

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    static boolean frontAgain(String str) {
        return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
    }

}
