package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Diff21 {

    public static void main(String[] args) {
        System.out.println(diff21(43));
    }

    static int diff21(int n) {
        int absoluteValue = Math.abs(n - 21);

        if(n > 21){
            return 2 * absoluteValue;
        }else{
            return absoluteValue;
        }

    }
}
