package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }

    static boolean bobThere(String str) {
        for(int i=0; i<str.length()-2;i++)
            if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        return false;
    }

}
