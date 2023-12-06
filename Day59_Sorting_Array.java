package day1_ngoding;

import java.util.Arrays;

public class Day59_Sorting_Array {
    public static void main(String[] args) {
//      Membuat urutan pada array menggunakan sort
        int[] angka = {5,3,1,7,2,9,3,8,6};
        System.out.println("Sebelum : " + Arrays.toString(angka));
//      disini kita menampilkan nilai array sebelum diurutkan

        Arrays.sort(angka);
//      sort disini berfungsi untuk mengurutkan data yang tersimpan di array
        System.out.println("Sesudah : " + Arrays.toString(angka));
//      dan disini kita akan menampilkan data yang sudah diurutkan menggunakan Arrays.sort
    }
}
