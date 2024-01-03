package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MissingChar {

    public static void main(String[] args) {
        System.out.println(missingChar("hey Code", 4));
    }

    static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1);

        return front + back;
    }

}
