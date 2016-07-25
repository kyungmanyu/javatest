package test;

public class Main {

    public static void main(String[] args) {

        /*
         * buble   
         */
        //        int indexs[] = { 3, 4, 1, 6, 7 };
        //        int temp;
        //        for (int i = 0; i < indexs.length - 1; i++) {
        //            for (int j = 0; j < indexs.length - 1 - i; j++) {
        //
        //                if (indexs[j] > indexs[j + 1]) {
        //                    temp = indexs[j];
        //                    indexs[j] = indexs[j + 1];
        //                    indexs[j + 1] = temp;
        //                }
        //
        //            }
        //        }
        //
        //        for (int p = 0; p < indexs.length; p++) {
        //            System.out.println(indexs[p] + ",");
        //        }

        /*
         * fibonachi
         */

        //        for(int i = 0 ; i < 5 ; i++){
        //            
        //            System.out.println("                                  "+fibonachi(i)+ " ");
        //        }

        System.out.println(9|(2<<1));

    }

    private static int factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
    

    //    private static int fibonachi(int n) {
    //        System.out.println("start n "+n);
    //        if (n <= 1) {
    //            System.out.println("(n < =1) "+n);
    //            return n;
    //        } else {
    //            System.out.println("(n > 2) "+n);
    //            return fibonachi(n-2) + fibonachi(n-1);
    //        }
    //        
    //    }

}
