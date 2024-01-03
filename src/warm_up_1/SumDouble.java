package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SumDouble {

    public static void main(String[] args) {
        System.out.println(sumDouble(5, 7));
    }

    static int sumDouble(int a, int b) {
        if(a != b){
            return a + b;
        }else{
            return (a+b) * 2;
        }
    }

}
