import java.util.Scanner;

public class day068 {
    public static void main(String[] args) {
    int data []= new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < data.length; i++) {
            System.out.print("masukkan angka ke-"+i+"=");
            data[i]=sc.nextInt();
    }
    System.out.println("--------------------------");
    int jumlah=0;
    for(int b : data){
        System.out.println(b);
        jumlah += data[b];
    }
    System.out.println("jumlah data :"+jumlah);
        
        }
}

