package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class MIxString {


    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    static String mixString(String a, String b) {
        int i = 0;
        StringBuilder blr =  new StringBuilder();
        while(i<a.length() && i <b.length()){
            blr.append(a.charAt(i));
            blr.append(b.charAt(i));
            i++;
        }
        blr.append(a.substring(i));
        blr.append(b.substring(i));
        return blr.toString();
    }



}
