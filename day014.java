import java.util.Scanner;
public class day014 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("masukkan panjang :");
        int panjang=input.nextInt();

        Scanner input1=new Scanner(System.in);
        System.out.println("masukkan lebar :");
        
        int lebar=input1.nextInt();
        System.out.println("luas tanah :"+panjang*lebar);
    }
}