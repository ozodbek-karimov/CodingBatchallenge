package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StringBits {


    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }

    static String stringBits(String str) {

        StringBuilder blr = new StringBuilder();

        for (int viewer = 0; viewer < str.length(); viewer += 2){
            blr.append(str.charAt(viewer));
        }

        return blr.toString();

    }

}
