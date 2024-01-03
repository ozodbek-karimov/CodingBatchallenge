package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class BackAround {

    public static void main(String[] args) {
        System.out.println(backAround("Hey Code"));
    }

    static String backAround(String str) {
        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

}
