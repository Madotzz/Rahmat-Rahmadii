package day1_ngoding;

import java.util.Scanner;

public class Day47_Array_Searching {
    public static void main(String[] args) {
//      Mencari nilai pada array 1 dimensi
        Scanner input = new Scanner(System.in);
        int[] angka = {2, 4, 6, 8, 10, 12, 14};
        System.out.print("Data angka : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        System.out.print("Cari angka : ");
        int cari = input.nextInt();
        int count = 0;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Hasil Pencarian : ");
        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]){
                System.out.println("Index ke-" + i);
                count++;
            }
        }
        if (count == 0){
            System.out.println("Data tidak ditemukan !");
        }
    }
}
