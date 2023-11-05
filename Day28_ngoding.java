package day1_ngoding;

import java.util.Scanner;

public class Day28_ngoding {

    public static void main(String[] args) {
//      Latihan perulangan do while
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka awal : ");
        int awal = input.nextInt();
        System.out.print("Masukkan angka akhir : ");
        int akhir = input.nextInt();

        do {
            System.out.print(awal + " ");
            awal++;
        } while (awal <= akhir);
        System.out.println();
    }

}
