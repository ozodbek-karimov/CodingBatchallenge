package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ExtraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
        System.out.println(extraEnd("ab"));
        System.out.println(extraEnd("Hi"));
    }

    static String extraEnd(String str) {


        if (str.length() >= 2) {
            String copyStr = str.substring(str.length() - 2);
           return copyStr + copyStr + copyStr;
        }else{
            return str;
        }
    }
}
