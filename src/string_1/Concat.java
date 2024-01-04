package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Concat {

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    static String conCat(String a, String b) {
        return a.isEmpty() || b.isEmpty() ? a + b : (a.charAt(a.length()-1) == b.charAt(0) ? a + b.substring(1) : a + b);
    }

}
