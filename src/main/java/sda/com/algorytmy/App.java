package sda.com.algorytmy;

/**
 * Hello world!
 */

public class App {


    //        public static int silnia ( int n){
//            return silnia(n);
//
//        }
    public static void main(String[] args) {
//            int silnia = 5;
//            int wynik = 1;
//            for (int i = 1; i <= silnia; i++) {
//                wynik = wynik * i;
//            }
//            System.out.println(wynik);

//        }
//

    }

    public static int ciag2(int a) {
        if (a == 1) {
            return -1;
        }
        return -ciag2(a - 1) * a - 3;
    }
}










