package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class XyzMiddle {


    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    static boolean xyzMiddle(String str) {
        if(str.length() < 3)  return false;
        int st1 = str.length() / 2 - 2;
        int st2 = str.length() / 2 - 1;
        if(str.length() % 2 == 0) {
            return str.startsWith("xyz", st1) ||
                    str.startsWith("xyz", st2); }

        return str.startsWith("xyz", st2);
    }


}
