package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class hasBad {

    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }


    static boolean hasBad(String str) {
        return str.startsWith("bad",0) || str.startsWith("bad", 1);
    }

}
