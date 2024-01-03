package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FirstTwo {

    public static void main(String[] args) {

        System.out.println(firstTwo("Hello"));
        System.out.println(firstTwo("abcdefg"));
        System.out.println(firstTwo("ab"));
    }

    static String firstTwo(String str) {

        if (str.equals("")) return "";
        if (str.length() <= 2){
            return str;
        }else{
            return str.substring(0, 2);
        }

    }
}
