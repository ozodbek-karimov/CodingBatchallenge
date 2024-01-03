package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeOutWord {

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
    }

    static String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

}
