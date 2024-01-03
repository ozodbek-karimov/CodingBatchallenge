package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class Front3 {

    public static void main(String[] args) {
        System.out.println(front3("Hey Java"));
    }

    static String front3(String str) {

        String copyString;
        if(str.length() >= 3){
            copyString = str.substring(0,3);
        }else{
            copyString = str;
        }

        return copyString + copyString + copyString;
    }

}
