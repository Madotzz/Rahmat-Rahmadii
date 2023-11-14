package day1_ngoding;

import java.util.Scanner;

public class Day37_ngoding {
    public static void main(String[] args) {
//      Menentukan bilangan ganjil menggunakan perulangan while
        Scanner input = new Scanner(System.in);
        System.out.print("Angka awal : ");
        int awal = input.nextInt();
        System.out.print("Angka akhir : ");
        int akhir = input.nextInt();
        while (awal <= akhir){
            int hasil = awal % 2;
            if (hasil == 1){
                System.out.print(awal + " ");
            }
            awal++;
        }
        System.out.println();
        
    }
}
