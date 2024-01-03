package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeTags {

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
    }

    static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
