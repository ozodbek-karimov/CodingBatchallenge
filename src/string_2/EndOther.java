package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class EndOther {


    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }

    static boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.endsWith(b) || b.endsWith(a)) return true;
        return false;
    }

}
