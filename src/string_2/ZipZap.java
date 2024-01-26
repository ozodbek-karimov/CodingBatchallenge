package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class ZipZap {


    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));
    }

    static String zipZap(String str) {
        char[] arr = new char[str.length()];
        int count = 0;
        int i = 0;
        while(i < str.length()) {
            if(i < str.length() - 2 && str.charAt(i) == 'z' &&
                    str.charAt(i + 2) == 'p') {
                arr[count] = 'z';  count++;
                arr[count] = 'p';  count++;
                i += 3; }
            else {
                arr[count] = str.charAt(i);  count++;
                i++; }
        }
        return new String(arr, 0, count);
    }


}
