package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class EveryNth {

    public static void main(String[] args) {
        System.out.println(everyNth("abcdefg", 2));
    }

    static String everyNth(String str, int n) {

        String result = "";

        for (int viewer = 0; viewer < str.length(); viewer +=n ){
             result = result + str.charAt(viewer);
        }

        return result;
    }

}
