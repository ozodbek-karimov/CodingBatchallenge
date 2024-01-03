package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class NotString {

    public static void main(String[] args) {
        System.out.println(notString("Hi CodingBat"));
    }

    static String notString(String str) {
        if(str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }else{
            return "not " + str;
        }
    }

}
