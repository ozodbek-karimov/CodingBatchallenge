package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MinCat {


    public static void main(String[] args) {
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }

    static String minCat(String a, String b) {
        return a.length() > b.length() ? a.substring(a.length() - b.length()) + b : a + b.substring(b.length() - a.length());
    }

}
