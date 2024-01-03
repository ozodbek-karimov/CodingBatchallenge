package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ParrotTrouble {

    public static void main(String[] args) {
        System.out.println(parrotTrouble(false, 5));
    }

    static boolean parrotTrouble(boolean talking, int hour) {
        if(talking && (hour < 7 || hour > 20)){
            return true;
        }else{
            return false;
        }
    }

}
