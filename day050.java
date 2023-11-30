public class day050 {
    public static void main(String[] args) {
        int [] data ={70,90,86,95,78};
        int jumlah=0;
        for (int i = 0; i < data.length; i++) {
            jumlah += data[i];
            
        }
        System.out.println("hasil penjumlahan :"+jumlah);
    }
}