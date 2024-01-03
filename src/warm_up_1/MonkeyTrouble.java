package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MonkeyTrouble {

    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true, false));
    }

    static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // if(aSmile && bSmile){
        //   return true;
        // }else if(!aSmile && !bSmile){
        //     return true;
        // }
        // return false;
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}
