import java.util.Scanner;

public class day082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai harta waris: ");
        double nilaiHartaWaris = scanner.nextDouble();

        System.out.print("Masukkan jumlah ahli waris: ");
        int jumlahAhliWaris = scanner.nextInt();

        double[] proporsi = new double[jumlahAhliWaris];

        for (int i = 0; i < jumlahAhliWaris; i++) {
            System.out.print("Masukkan proporsi ahli waris ke-" + (i + 1) + ": ");
            proporsi[i] = scanner.nextDouble();
        }
        System.out.println("\nPembagian harta waris:");
        for (int i = 0; i < jumlahAhliWaris; i++) {
            double bagian = nilaiHartaWaris * proporsi[i] / 100;
            System.out.println("Ahli Waris ke-" + (i + 1) + ": " + bagian);
        }

        scanner.close();
    }
}

