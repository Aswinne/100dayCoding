public import java.util.Scanner;

public class day065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("pilihan menu makanan");
        System.out.println("1. nasi goreng");
        System.out.println("2. ayam geprek");
        System.out.println("3. nasi ayam");
        System.out.print("masukkan menu :");
        int menu = sc.nextInt();
        
        if (menu == 1){
            System.out.println("maka nasi goreng di terima");
        }else if(menu == 2){
            System.out.println("ayam geprek kosong");
        }else if(menu == 3){
            System.out.println("nasi ayam");
        }else{
            System.out.println("koosoongg");
        }
        
    }
}
