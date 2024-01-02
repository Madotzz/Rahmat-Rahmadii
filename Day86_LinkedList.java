package day1_ngoding;

import java.util.*;

public class Day86_LinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList <String> namaKawan = new LinkedList<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        String nama;
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan nama Kawan : ");
            nama = input.next();
            namaKawan.add(nama);
        }

        System.out.println("List Nama Kawan");
        System.out.println(namaKawan);
        
        namaKawan.set(3, "Rian");
        System.out.println("List Nama Kawan setelah mengganti index ke 3 \n" + namaKawan);
        
        System.out.println("Apakah ada elemen namaKawan yang bernama Rahmat? \n" + namaKawan.contains("Rahmat"));
        
        namaKawan.offer("Rahmat");
        System.out.println("List Nama Kawan setelah menambahkan elemen Rahmat \n" + namaKawan);
        
        namaKawan.offerFirst("Gedry");
        namaKawan.offerLast("Fadhlur");
        System.out.println("List Nama Kawan setelah menambahkan elemen pada bagian pertama dan terakhir \n" + namaKawan);
    }
}
