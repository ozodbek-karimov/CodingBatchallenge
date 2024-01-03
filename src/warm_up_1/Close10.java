package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Close10 {

    public static void main(String[] args) {

        System.out.println(close10(9, 8));
    }

    static int close10(int a, int b) {

        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);


        if (aDiff < bDiff){
            return a;
        } else if (bDiff < aDiff) {
            return b;
        }else{
            return 0;
        }

    }

}
