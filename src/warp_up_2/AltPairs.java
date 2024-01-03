package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class AltPairs {

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    static String altPairs(String str) {

        StringBuilder blr = new StringBuilder();

        for (int viewer = 0; viewer < str.length(); viewer += 4){
            blr.append(str.charAt(viewer));

            if (viewer + 1 < str.length()) {
                blr.append(str.charAt(viewer + 1));
            }
        }


        return blr.toString();
    }
}
