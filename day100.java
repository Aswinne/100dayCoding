import java.util.Scanner;

public class day100 {
    public static void main(String[] args) {
        System.out.println("==WELCOME TO WARUNG MANDAR==");
        System.out.println("MENU :");
        System.out.println("1. nasi goreng(diskon 30%)");
        System.out.println("2. ayam goreng");
        System.out.println("3. ayam penyet");
        System.out.println("4. bakso");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nomor pesanan :");
        int pesanan = sc.nextInt();
        
        if (pesanan == 1){
            System.out.println("15.000");
            int a = 15000 - 5000;
            System.out.println("diskon 30% ="+a);
        }else if (pesanan == 2){
            System.out.println("13.000");
        }else if(pesanan == 3){
            System.out.println("12.000");
        }else if(pesanan == 4){
            System.out.println("10.000");
        }else{
            System.err.println("Eror: karna nilai yang dimasukkan hanya 1-4");
        }
    }
}