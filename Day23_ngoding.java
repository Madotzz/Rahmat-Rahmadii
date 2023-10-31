package day1_ngoding;

import java.util.Scanner;

public class Day23_ngoding {

    public static void main(String[] args) {
//      Latihan percabangan || membuat program untuk mengetahui penghasilan bersih per bulan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan penghasilan : Rp.");
        double gaji = input.nextDouble();
        System.out.print("Jenis Pekerjaan : ");
        String jenis = input.next();
        if (gaji > 3_000_000 && gaji <= 5_000_000) {
            System.out.println("Dikenakan Pajak 5%");
            double pajak = gaji * 0.05;
            System.out.println("Penghasilan bersihnya adalah : Rp." + (gaji - pajak));
        } else if (gaji >= 5_000_000) {
            System.out.println("Dikenakan pajak 10%");
            double pajak = gaji * 0.1;
            System.out.println("Penghasilan bersihnya adalah : Rp." + (gaji - pajak));
        } else if ("PNS" == jenis) {
            System.out.println("Pajak Ditambah 5%");
            double pajak = gaji + 0.05;
            System.out.println("Penghasilan bersihnya adalah : Rp." + (gaji - pajak * 0.05));
        } else {
            System.out.println("Tidak dikenakan pajak");
            System.out.println("Penghasilan bersihnya adalah : Rp." + gaji);
        }
    }
}
