

//  ====PENDING====
public class pattern8 {
    public static void main(String[] args) {
        int n = 6;

        //System.out.println("\n");
            for(int i=0; i<n; i++){// outer loop
            for(int j=0; j<=i; j++){//inner loop
                System.out.print(" ");
            }
            for(int j=0; j<9-(2*i); j++){
                System.out.print("*");
            }
            for(int j=0; j<=i; j++){//inner loop
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}

