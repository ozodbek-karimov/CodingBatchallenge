package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FrontBack {

    public static void main(String[] args) {
        System.out.println(frontBack("Hi Java"));
    }

    static String frontBack(String str) {
        if(str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }

}
