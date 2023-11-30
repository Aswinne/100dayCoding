import java.util.ArrayList;

public class day051 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        
        data.add("aswin");
        data.add(20);
        data.add(2.474748);
        data.add('C');
        data.add(true);
        
        data.remove("aswin");
        
        System.out.println(data);
        
        System.out.println("berisi ["+data.size()+"] data");
    }
}
