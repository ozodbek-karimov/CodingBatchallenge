package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class RepeatSeparator {

    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    static String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        StringBuilder blr = new StringBuilder();
        for (int i = 0; i < count - 1; i++) {
            blr.append(word);
            blr.append(sep);
        }
        return blr.append(word).toString();
    }


}
