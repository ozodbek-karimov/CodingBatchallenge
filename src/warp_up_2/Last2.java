package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Last2 {

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }

    static int last2(String str) {

        int count = 0;

        if (str.length() < 2) {
            return count;
        }

        String lastTwo = str.substring(str.length() - 2);

        for (int viewer = 0; viewer < str.length() - 2; viewer++) {
            if (str.substring(viewer, viewer + 2).equals(lastTwo)) {
                count++;
            }
        }

        return count;
    }
}
