import java.util.Scanner;

public class day081{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Masukkan masa kerja (tahun): ");
        int masaKerja = scanner.nextInt();

        double bonus = hitungBonus(masaKerja);

        double totalGaji = gajiPokok + bonus;
        System.out.println("Gaji PNS");
        System.out.println("Gaji Pokok   : " + gajiPokok);
        System.out.println("Bonus        : " + bonus);
        System.out.println("Total Gaji   : " + totalGaji);
    }
    public static double hitungBonus(int masaKerja) {
        double bonus = 0;

        if (masaKerja >= 5 && masaKerja < 10) {
            double gajiPokok = 0;
            bonus = 0.05 * gajiPokok; // Bonus 5% dari gaji pokok
        } else if (masaKerja >= 10) {
            double gajiPokok = 0;
            bonus = 0.1 * gajiPokok;  // Bonus 10% dari gaji pokok
        }

        return bonus;
    }
}


