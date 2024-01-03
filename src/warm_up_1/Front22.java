package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Front22 {

    public static void main(String[] args) {
        System.out.println(front22("Hi CodingBat"));
    }

    static String front22(String str) {

        int take = 2;

        if(take > str.length()){
            take = str.length();
        }

        String newStr = str.substring(0, take);
        return newStr + str + newStr;

    }

}
