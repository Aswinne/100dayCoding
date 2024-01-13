import java.util.Scanner;

public class day094{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka (0 untuk berhenti): ");
        int inputAngka = sc.nextInt();

        int totalAngkaGenap = 0;
        int totalAngkaGanjil = 0;

        while (inputAngka != 0) {
            if (inputAngka % 2 == 0) {
                totalAngkaGenap += inputAngka;
            } else {
                totalAngkaGanjil += inputAngka;
            }
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            inputAngka = sc.nextInt();
        }

        System.out.println("Jumlah semua angka genap sebelumnya: " + totalAngkaGenap);
        System.out.println("Jumlah semua angka ganjil sebelumnya: " + totalAngkaGanjil);

        sc.close();
    }
}
