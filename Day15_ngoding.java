package day1_ngoding;

import java.util.Scanner;

public class Day15_ngoding {
    public static void main(String[] args) {
//  Menentukan uang bersih penjualan tanah menggunakan percabangan if-else if-else
    Scanner input = new Scanner(System.in);
        System.out.print("Masukkan luas tanah : ");
        int luas = input.nextInt();
        double harga = 300000;
        double uangbersih = luas * harga;
        if (uangbersih > 50_000_000 && uangbersih < 100_000_000){
            System.out.println("Dikenakan pajak 3%");
            double pajak = uangbersih - (uangbersih * 0.03);
            System.out.println("Harga jual : Rp." + pajak);
        }else if (uangbersih >= 100_000_000){
            System.out.println("Dikenakan pajak 5%");
            double pajak = uangbersih - (uangbersih * 0.05);
            System.out.println("Harga Jual : Rp." + pajak);
        }else if (uangbersih < 50_000_000){
            System.out.println("Dikenakan pajak 1%");
            double pajak = uangbersih - (uangbersih * 0.01);
            System.out.println("Harga Jual : RP." + pajak);
        }else {
            System.out.println("Tidak dikenakan Pajak");
        }
    }
}
