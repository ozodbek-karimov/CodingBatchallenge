package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SameStarChar {


    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*a"));
    }

    static boolean sameStarChar(String str) {
        for(int i = 1; i < str.length() - 1; i++)
            if(str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1))
                return false;

        return true;
    }


}
