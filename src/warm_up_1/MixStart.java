package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MixStart {

    public static void main(String[] args) {
        System.out.println(mixStart("mix snacks"));
    }

    static boolean mixStart(String str) {

        if(str.length() >= 3 && str.startsWith("ix", 1)){
            return true;
        }else{
            return false;
        }
    }

}
