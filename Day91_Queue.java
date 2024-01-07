package day1_ngoding;
import java.util.*;
public class Day91_Queue {
    public static void main(String[] args) {
//      Membuat program objek Queue menggunakan LinkedList
        Queue<String> benda = new LinkedList<>();
        
//      menambah elemen ke dalam Queue
        benda.offer("Kayu");
        benda.offer("Meja");
        benda.offer("Obeng");
        benda.offer("Kipas");
        benda.offer("Raket");
        benda.offer("Lampu");
        
//      Mencetak elemen yang ada dalam Queue
        System.out.println("List Benda : " + benda);
        
//      Mengambil dan menghapus elemen pertama dari Queue
        
        String hapus = benda.poll();
        System.out.println("Elemen yang dihapus : " + hapus);
        
        System.out.println("List Benda setelah menghapus elemen pertama : " + benda);
        
//      Mengambil elemen pertama tanpa menghapus
        String first = benda.peek();
        System.out.println("Elemen pertama dalam List Benda : " + first);
        
        System.out.println("List Benda setelah melakukan operasi peek : " + benda);
    }
}
