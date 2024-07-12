public class pattern17 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            char ch='A';
            ch= (char) (ch+i);
            for(int j=1; j<=i; j++){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
    }
}
// ===PENDING===

