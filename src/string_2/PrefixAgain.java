package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc",2));
        System.out.println(prefixAgain("abXYabc", 3));
    }


    static boolean prefixAgain(String str, int n) {

        return str.substring(n).contains(str.substring(0,n));
    }

}
