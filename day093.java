import java.util.Scanner;
public class day093 {

    public static void main(String[] args) {
        String[] menuMakanan = {"Nasi Goreng", "Mie Goreng", "Sate Ayam", "Ayam Goreng", "Ikan Bakar"};

        System.out.println("=== Selamat Datang di Restoran XYZ ===");
        System.out.println("Menu Makanan:");
        for (int i = 0; i < menuMakanan.length; i++) {
            System.out.println((i + 1) + ". " + menuMakanan[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih nomor menu yang diinginkan (1-" + menuMakanan.length + "): ");
        int pilihan = sc.nextInt();
        
        if (pilihan >= 1 && pilihan <= menuMakanan.length) {
            System.out.println("Anda memesan: " + menuMakanan[pilihan - 1]);
            System.out.println("Terima kasih telah memesan. Selamat menikmati!");
        } else {
            System.out.println("Maaf, nomor menu tidak valid. Silakan pilih nomor menu yang benar.");
        }
        sc.close();
    }
}
