import java.util.ArrayList;

public class day023 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan nama
        ArrayList<String> namaList = new ArrayList<>();

        // Menambahkan nama "Aswin" ke ArrayList
        namaList.add("Aswin");

        // Menambahkan nama "Fadli" ke ArrayList
        namaList.add("Fadli");

        // Menampilkan isi dari ArrayList
        System.out.println("Isi dari ArrayList:");
        for (String nama : namaList) {
            System.out.println(nama);
        }
    }
}
