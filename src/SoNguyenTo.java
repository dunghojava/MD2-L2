import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in: ");
        int numbers = scanner.nextInt();
        int n = 2;
        for (int count = 0; count < numbers; ) {
            int count2 = 0;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count2++;
                }
            }
            if (count2 == 0 && n > 1) {
                System.out.print(n + ", ");
                count++;
            }
            n++;
        }
    }
}
