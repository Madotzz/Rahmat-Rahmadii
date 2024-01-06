package day1_ngoding;

import java.util.*;

public class Day90_Stack {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> dataMhs = new Stack<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        String nama;
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan Nama : ");
            nama = input.next();
            dataMhs.push(nama);
        }
        System.out.println("Daftar Nama Mahasiswa");
        for (int i = 0; i < dataMhs.size(); i++) {
            System.out.println(dataMhs.get(i));
        }
        
        String atas = dataMhs.peek();
        System.out.println("Nama Mahasiswa Teratas : " + atas);
        
        String hapus = dataMhs.pop();
        System.out.println("Nama yang di hapus : " + hapus);

        System.out.println("Daftar Nama Mahasiswa setelah menghapus / POP");
        for (int i = 0; i < dataMhs.size(); i++) {
            System.out.println(dataMhs.get(i));
        }
    }

}
