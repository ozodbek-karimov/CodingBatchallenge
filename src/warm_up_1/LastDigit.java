package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class LastDigit {

    public static void main(String[] args) {
        System.out.println(lastDigit(3, 113));
    }

    static boolean lastDigit(int a, int b) {

        return (a % 10 == b % 10);
    }

}
