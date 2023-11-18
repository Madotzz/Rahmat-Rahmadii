package day1_ngoding;

import java.util.Scanner;

public class Day41_Luas_Dan_Keliling_Segitiga {
    public static void main(String[] args) {
//      Menghitung luas dan keliling segitiga sama sisi
        Scanner input = new Scanner(System.in);
        System.out.print("Alas   : ");
        double alas = input.nextDouble();
        System.out.print("Tinggi : ");
        double tinggi = input.nextDouble();
        double sisi = alas;
        double luas = 0.5 * (alas * tinggi);
        double keliling = sisi + sisi + sisi;
        System.out.println("Luas : " + luas);
        System.out.println("Keliling : " + keliling);
    }
}
