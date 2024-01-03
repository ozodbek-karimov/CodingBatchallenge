package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class IOneTeen {

    public static void main(String[] args) {
        System.out.println(loneTeen(21, 19));
    }

    static boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);

    }

}
