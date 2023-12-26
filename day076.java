import java.util.Scanner;

public class day076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan penghasilan :");
        int penghasilan = sc.nextInt();
        
        if(penghasilan >= 3000000){
            System.out.println("pajak 5%");
            System.out.println(penghasilan - (penghasilan * 0.05));
        }else if(penghasilan >= 5000000){
            System.out.println("PAJAK 10%");
            System.out.println(penghasilan - (penghasilan*0.1));
        }else{
            System.out.println("tidak dikenakan pajak");
    }
}}
