import java.util.Scanner;

public class day098 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka > 0) {
            System.out.println("Angka yang dimasukkan adalah positif.");
        } else if (angka < 0) {
            System.out.println("Angka yang dimasukkan adalah negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah nol.");
        }

        System.out.print("Masukkan jumlah perulangan: ");
        int jumlahPerulangan = scanner.nextInt();

        System.out.println("Perulangan dimulai:");

        for (int i = 1; i <= jumlahPerulangan; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        scanner.close();
    }
}
