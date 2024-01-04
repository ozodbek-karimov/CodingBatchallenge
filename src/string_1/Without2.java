package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Without2 {

    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

    static String without2(String str) {
        if (str.length() == 1){
            return str;
        }else if (str.length() <= 2){
            return "";
        }else if (str.substring(0, 2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        }else{
            return str;
        }

        /**    return str.length() == 1 ?
              str : (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2)) ?
              str.substring(2) : str);
         */
    }

}
