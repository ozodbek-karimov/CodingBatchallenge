package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class RepeatFront {

    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
        System.out.println(repeatFront("Chocolate",3));
        System.out.println(repeatFront("Ice Cream", 2));
    }

    static String repeatFront(String str, int n) {
        StringBuilder blr = new StringBuilder();
        for (int i = n; i > 0; i--)
            blr.append(str, 0, i);
        return blr.toString();
    }


}
