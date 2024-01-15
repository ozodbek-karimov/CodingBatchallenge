package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class XBalance {


    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }

    static boolean xyBalance(String str) {
        for(int i=0; i<str.length(); i++)
            if(str.lastIndexOf("y") < str.lastIndexOf("x")) return false;
        return true;
    }


}
