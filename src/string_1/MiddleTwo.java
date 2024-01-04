package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MiddleTwo {


    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    static String middleTwo(String str) {
        return str.length() <= 2 ? str : str.substring(str.length() / 2 - 1, str.length() / 2  + 1);
    }

}
