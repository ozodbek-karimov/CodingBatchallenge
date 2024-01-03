package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class HelloName {

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Mark"));

    }

    static String helloName(String name) {
        return "Hello " + name + "!";
    }

}
