package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MakeAbba {

    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye"));
    }

    static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

}
