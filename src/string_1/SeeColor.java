package string_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class SeeColor {


    public static void main(String[] args) {
        System.out.println(seeColor("redxx"));
        System.out.println(seeColor("xxred"));
        System.out.println(seeColor("blueTimes"));
    }
    static String seeColor(String str) {
        return str.startsWith("blue") ? "blue" : str.startsWith("red") ? "red" : "";
    }

}
