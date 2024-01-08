package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class CountCode {


    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }

    static int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length()-3; i++) {
            if(str.startsWith("co", i) && str.charAt(i + 3) == 'e'){
                count++;
            }
        }

        return count;
    }

}
