/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
 */


public class pattern7 {
        public static void main(String[] args) {
            int n=6;
            for(int i=0; i<n; i++){// outer loop
                for(int j=0; j<n-i-1; j++){//inner loop
                    System.out.print(" ");
                }
                for(int j=0; j<2*i-1; j++){
                    System.out.print("*");
                }
                for(int j=0; j<n-i-1; j++){//inner loop
                    System.out.print(" ");
                }
                System.out.print("\n");
            }
        }
    }

