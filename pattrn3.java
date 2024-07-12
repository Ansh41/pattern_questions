public class pattrn3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){// outer loop
            for(int j=1; j<=i; j++){//inner loop
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
