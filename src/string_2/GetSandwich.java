package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class GetSandwich {


    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));
    }

    static String getSandwich(String str) {

        int b1 = str.indexOf("bread");
        int b2 = str.lastIndexOf("bread");
        if(b1>=0 && b2>=0 && b1!=b2)
            return str.substring(b1 + 5, b2);

        else return "";
    }


}
