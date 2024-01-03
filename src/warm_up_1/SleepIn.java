package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(true, true));
    }

    static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

}
