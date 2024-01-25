    package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class OnrTwo {


    public static void main(String[] args) {
        System.out.println(oneTwo( "abc"));
        System.out.println(oneTwo( "tca"));
        System.out.println(oneTwo( "tcagdo"));
    }

    static String oneTwo(String str) {
        StringBuilder blr = new StringBuilder();
        for(int i=0; i<str.length()-2; i+=3)
            blr.append(str.charAt(i+1)).append(str.charAt(i+2)).append(str.charAt(i));

        return blr.toString();
    }


}
