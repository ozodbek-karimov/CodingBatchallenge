package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class TheEnd {

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    static String theEnd(String str, boolean front) {
        return                  str.length() <= 1 ?
                                str :
                                front ? str.substring(0, 1) :
                                str.substring(str.length()-1);
    }

}
