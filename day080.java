import java.util.Arrays;
import java.util.Scanner;

public class day080 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in); 
        System.out.print("masukkan panjang : ");
        int panjang=input.nextInt();
        
        System.out.print("masukkan lebar : ");
        int lebar=input.nextInt();
        
        int[][] angka=new int [panjang][lebar];

        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("masukkan data["+i +"]["+j +"] = ");
                angka [i][j] = input.nextInt();
                
            }
            System.out.println();
       
                
}}}
            
    
   

