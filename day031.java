import java.util.Scanner;
public class day031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scanner.nextInt();
        System.out.println("Masukkan " + jumlahAngka + " angka:");

        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print("Angka ke-" + i + ": ");
            int angka = scanner.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        }

    }
}