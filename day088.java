import java.util.Scanner;

public class day088 {
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

        String kelompokAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + kelompokAngka);

        String rentangAngka = (angka >= 10 && angka <= 100) ? "antara 10 dan 100" : "di luar rentang 10 dan 100";
        System.out.println("Angka " + rentangAngka);

        sc.close();
    }
}