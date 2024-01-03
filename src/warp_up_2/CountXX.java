package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class CountXX {

    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxxx"));
        System.out.println(countXX("xxx"));
    }

    public static int countXX(String str) {

        int count = 0;

        for(int viewer = 0; viewer < str.length() - 1; viewer++){
            if (str.startsWith("xx", viewer)){
                count++;
            }
        }
        return count;
    }
}
