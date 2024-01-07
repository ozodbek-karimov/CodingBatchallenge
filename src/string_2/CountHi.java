package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class CountHi {


    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("h"));
    }

    static int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i'){
                count++;
            }
        }

        return count;
    }

}
