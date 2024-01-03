import java.util.Scanner;

public class day084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jarak tempuh mobil: ");
        double jarakTempuh = sc.nextDouble();

        System.out.print("Masukkan jumlah bahan bakar(liter): ");
        double bahanBakar = sc.nextDouble();

        double konsumsiBahanBakar = hitungKonsumsiBahanBakar(jarakTempuh, bahanBakar);

        System.out.println("Konsumsi bahan bakar mobil: " + konsumsiBahanBakar + " km/liter");

        sc.close();
    }
    public static double hitungKonsumsiBahanBakar(double jarakTempuh, double bahanBakar) {
        if (bahanBakar <= 0 || jarakTempuh <= 0) {
            System.out.println("Masukkan tidak valid. Harap masukkan nilai positif untuk jarak tempuh dan bahan bakar.");
            return 0;
        }
        return jarakTempuh / bahanBakar;
    }
}
