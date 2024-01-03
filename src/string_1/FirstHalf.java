package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FirstHalf {

    public static void main(String[] args) {
        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
    }

    static String firstHalf(String str) {
        if (str.equals("")) return "";
        int mid = str.length() / 2;
        return str.substring(0, mid);
    }
}
