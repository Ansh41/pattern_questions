public class pattern5 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){// outer loop
            for(int j=5; j>=i; j--){//inner loop
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

