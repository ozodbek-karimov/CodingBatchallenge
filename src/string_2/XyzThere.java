package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class XyzThere {


    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    static boolean xyzThere(String str) {
        if (str.startsWith("xyz")) return true;
        for (int i = 1; i < str.length() - 2; i++)
            if (str.startsWith("xyz", i) && str.charAt(i - 1) != '.') return true;

        return false;
    }

}
