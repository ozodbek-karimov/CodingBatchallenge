package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringMath {
    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }

    static int stringMatch(String a, String b) {

        int count = 0;
        int minLength = Math.min(a.length(), b.length());
        for (int viewer = 0; viewer < minLength - 1; viewer++) {
            String aSub = a.substring(viewer, viewer+2);
            String bSub = b.substring(viewer, viewer+2);
            if (aSub.equals(bSub)) {
                count++;
            }
        }

        return count;
    }

}
