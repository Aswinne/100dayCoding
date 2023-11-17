
    import java.util.Scanner;
    public class day037 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Masukkan jumlah pola : ");
            int jumlahPola = scanner.nextInt();
    
            for (int i = 0; i < jumlahPola; i++) {
                System.out.println("+--+--+");
            }
    
            scanner.close();
        }
    }
