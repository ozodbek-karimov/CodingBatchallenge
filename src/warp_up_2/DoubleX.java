package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xaxxx"));
    }

    static boolean doubleX(String str) {

        for (int viewer = 0; viewer < str.length() - 1; viewer++) {
            if (str.charAt(viewer) == 'x') {
                if (str.charAt(viewer + 1) == 'x') {
                    return true;
                }
                break;
            }
        }
        return false;

    }

}
