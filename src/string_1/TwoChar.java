package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class TwoChar {

    public static void main(String[] args) {
        System.out.println(twoChar("java", 0));
        System.out.println(twoChar("java", 2));
        System.out.println(twoChar("java", 3));
    }

    static String twoChar(String str, int index) {
        return index <= 0 || index >= str.length() - 1 ? str.substring(0, 2) : str.substring(index, index + 2);
    }

}
