package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringYak {

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }

    static String stringYak(String str) {


        StringBuilder blr = new StringBuilder();

        for (int viewer = 0; viewer < str.length(); viewer++) {
            if (viewer + 2 < str.length() && str.charAt(viewer) == 'y' && str.charAt(viewer + 2) == 'k') {
                viewer += 2;
            } else {
                blr.append(str.charAt(viewer));
            }
        }
        return blr.toString();
    }

}
