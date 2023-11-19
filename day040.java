
import java.util.Scanner;
    
public class day040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai :");
        int nilai =sc.nextInt();
            
        for (int i = 0; i <= nilai; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");    
            }
            System.out.println();
                
         }
    }
}
    
