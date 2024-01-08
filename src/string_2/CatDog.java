package string_2;

/**
 * Creator: Karimov Ozodbek
 * Date 02/02/2023
 */
public class CatDog {


    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
    }

    static boolean catDog(String str) {
            int countCat = 0;
            int countDog = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.startsWith("cat", i)){
                    countCat++;
                } else if (str.startsWith("dog", i)) {
                    countDog++;
                }
            }

            return countDog == countCat;
    }

}
