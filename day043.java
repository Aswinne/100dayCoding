import java.util.Scanner;

public class day043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("[1] hijau");
        System.out.println("[2] merah");
        System.out.println("[3] kuning");
        System.out.print("masukkan warna lalu lintas ;");
        int laluLintas=input.nextInt();
        
        if(laluLintas == 1){
            System.out.println("jalan");
        }else if(laluLintas == 2){
            System.out.println("berhenti");
        }else if(laluLintas == 3){
            System.out.println("hati-hati");
        }else{
            System.err.println("Eror");
        }
    }
}
