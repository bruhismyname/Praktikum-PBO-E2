import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // Kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        // Menempatkan elemen kunci dan nilai
        map.put(1, "Satu");
        map.put(2, "Dua");
        // Mengambil elemen pertama
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        // Mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();

    }
}