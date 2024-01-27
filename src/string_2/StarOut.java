package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class StarOut {


    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }

    static String starOut(String str) {
        if(str.length() < 1)
            return "";
        if(str.length() == 1) {
            if(str.charAt(0) == '*')
                return "";
            else
                return str;
        }
        char[] arr = new char[str.length()];
        int count = 0;
        if(str.charAt(0) != '*' && str.charAt(1) != '*') {
            arr[count] = str.charAt(0);
            count++;
        }
        for(int i = 1; i < str.length() - 1; i++) {
            if(str.charAt(i-1)!='*' && str.charAt(i) != '*' &&
                    str.charAt(i+1) != '*') {
                arr[count] = str.charAt(i);
                count++;
            }
        }
        if(str.charAt(str.length()-1) != '*' &&
                str.charAt(str.length()-2) != '*') {
            arr[count] = str.charAt(str.length() - 1);
            count++;
        }
        return new String(arr, 0, count);
    }


}
