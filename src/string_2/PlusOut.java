package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class PlusOut {


    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
    }

    static String plusOut(String str, String word) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while(i < str.length()) {
            if(i <= str.length() - word.length() &&
                    str.startsWith(word, i)) {
                result.append(word);
                i += word.length();
            } else {
                result.append("+");
                i++;
            }
        }

        return result.toString();
    }



}
