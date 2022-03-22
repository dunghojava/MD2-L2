import java.util.Scanner;

public class SoNguyenToMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so lon nhat: ");
        int max = scanner.nextInt();
        for (int n = 2; n <= max; n++) {
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 0 && n > 1) {
                System.out.print(n + ", ");
            }
        }
    }
}
