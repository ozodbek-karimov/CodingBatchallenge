package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class PostNeg {

    public static void main(String[] args) {
        System.out.println(posNeg(2, 4, false));
    }

    static boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a < 0 && b < 0);
        }else{
            return (a < 0 && b > 0) || (a >0 && b < 0);
        }
    }

}
