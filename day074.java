import java.util.Scanner;

public class day074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai :");
        int nilai = sc.nextInt();
        int jumlah =0;
        for (int i = 1; i <= nilai; i++) {
            jumlah += i;
            System.out.print(i);
            if(i<nilai){
                System.out.print("+");
                
            }
            
            
            
        }
        System.out.println("="+jumlah);
    }
}
