package day1_ngoding;

import java.util.Scanner;

public class Day13_ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Gaji Pokok : ");
        double gaji = input.nextDouble();
        double gajilembur = 55000;
        System.out.print("Lama lembur/jam : ");
        int lama = input.nextInt();
        double gajibersih = gaji + (lama * gajilembur);
        System.out.println("Gaji Bersih : " + gajibersih);
    }
}
