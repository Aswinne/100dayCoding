import java.util.Scanner;

public class day045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan baris :");
        int kolom = sc.nextInt();
        System.out.print("masukkan kolom :");
        int baris = sc.nextInt();
        
        for (int i = 1; i <= kolom; i++) {
            for (int j = 1; j <= baris; j++) {
                System.out.print("+--");
            }
            System.out.println("+");
            
        }
    
    }
}
