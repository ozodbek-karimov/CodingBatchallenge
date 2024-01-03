package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class EndUp {

    public static void main(String[] args) {
        System.out.println(endUp("hi there"));
    }

    static String endUp(String str) {
        if(str.length() >= 3){
            String front =  str.substring(0, (str.length() -3));
            String back = str.substring(str.length()- 3);
            return front + back.toUpperCase();
        }else{
            return str.toUpperCase();
        }
    }

}
