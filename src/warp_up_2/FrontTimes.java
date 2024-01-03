package warp_up_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("hey man", 3));
    }

    static String frontTimes(String str, int n) {

        StringBuilder blr = new StringBuilder();

        for(int viewer = 0; viewer < n; viewer++){
            if(str.length() >= 3){
                blr.append(str, 0, 3);
            }else{
                blr.append(str);
            }
        }

        return blr.toString();
    }

}
