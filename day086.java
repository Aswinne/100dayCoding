import java.util.Scanner;

public class day086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }

        if (angka % 2 == 0) {
            System.out.println("Angka genap");
        } else {
            System.out.println("Angka ganjil");
        }

        if (angka >= 10 && angka <= 100) {
            System.out.println("Angka berada di antara 10 dan 100");
        } else {
            System.out.println("Angka diluar rentang 10 dan 100");
        }
    }
}