package warm_up_1;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class DelDel {

    public static void main(String[] args) {
        System.out.println(delDel("adelHello"));
    }
    static String delDel(String str) {

        if(str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.charAt(0) + str.substring(4);
        }else{
            return str;
        }
    }

}
