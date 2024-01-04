package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class NTwice {

    public static void main(String[] args) {
        System.out.println(nTwice("Hello", 2));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));
    }


    static String nTwice(String str, int n) {
        return n == 0 ? "" : str.substring(0, n) + str.substring(str.length()-n);
    }

}
