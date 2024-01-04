package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class EndLy {

    public static void main(String[] args) {
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }


    static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

}
