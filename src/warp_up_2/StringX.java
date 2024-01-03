package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringX {

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    static String stringX(String str) {

        if (str.length() <= 2) return str;

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        StringBuilder blr = new StringBuilder().append(first);

        for (int viewer = 1; viewer < str.length()-1; viewer++) {
            char currentChar = str.charAt(viewer);
            if (currentChar != 'x') {
                blr.append(currentChar);
            }
        }

        return blr.append(last).toString();
    }
}
