package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Makes10 {

    public static void main(String[] args) {
        System.out.println(makes10(5, 3));
    }

    static boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || (a+b) == 10){
            return true;
        }else{
            return false;
        }
    }

}
