public class TamGiacCan {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.println("");
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((5 - i) * 2 + 1); j++) {
                System.out.print("*");
            }
        }
    }
}
