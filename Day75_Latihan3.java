package day1_ngoding;

import java.util.Scanner;

public class Day75_Latihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan penghasilan : ");
        double hasil = input.nextDouble();
        System.out.println("Jenis Pekerjaan : ");
        String jenis = input.next();
        double jml = 0;
        if (hasil <= 3_000_000){
            System.out.println("Pajak 5%");
            jml = hasil * 0.05;
            System.out.println(jml);
        }else if (hasil >= 3_000_001 && hasil <= 5_000_000){
            System.out.println("Pajak 10%");
            jml = hasil * 0.1;
            System.out.println(jml);
        }
        if (jenis.equalsIgnoreCase("PNS")){
            System.out.println("tambah pajak 5%");
            double total = jml * 0.5;
            System.out.println(total);
        }
    }
}
