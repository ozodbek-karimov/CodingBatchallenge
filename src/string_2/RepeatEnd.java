package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class RepeatEnd {


    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello",2));
        System.out.println(repeatEnd("Hello", 1));
    }

    static String repeatEnd(String str, int n) {
        StringBuilder blr = new StringBuilder();
        String pr = str.substring(str.length() - n);
        blr.append(pr.repeat(Math.max(0, n)));
        return blr.toString();
    }


}
