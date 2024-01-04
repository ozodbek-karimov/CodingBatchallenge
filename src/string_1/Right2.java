package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Right2 {

    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println(left2("Hi"));
    }

    static String left2(String str) {
        if (str.length() <= 2){
            return str;
        }else{
            return  str.substring(str.length()-2) +str.substring(0, str.length()-2);
        }
    }

}
