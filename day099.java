import java.util.Scanner;

public class day099 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Pilih operasi aritmatika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        double hasil = 0;
        boolean valid = true;

        do {
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka 1-4.");
                    valid = false;
            }
        } while (!valid);

        if (valid) {
            System.out.println("Hasil operasi: " + hasil);
        }
        input.close();
    }
}
