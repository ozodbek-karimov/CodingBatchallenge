package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringE {

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
    }

    static boolean stringE(String str) {
        int count = 0;

        for (int viewer = 0; viewer < str.length(); viewer++) {
            if (str.charAt(viewer) == 'e') count++;
        }

        return (count >= 1) && (count <= 3);
    }

}
