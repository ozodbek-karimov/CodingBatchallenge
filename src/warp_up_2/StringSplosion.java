package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringSplosion {

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }
    static String stringSplosion(String str) {

        StringBuilder blr = new StringBuilder();

        for (int viewer = 0; viewer < str.length(); viewer++){
            blr.append(str, 0, viewer+1);
        }

        return blr.toString();
    }

}
