package day1_ngoding;

import java.util.Scanner;

public class Day7_ngoding {
    public static void main(String[] args) {
//      Berikut adalah cara mengoperasikan percabangan menggunakan inputan/Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Gaji : ");
        double gaji = input.nextDouble();
        if(gaji >= 2000000 && gaji <= 6000000){
            System.out.println("Dipotong Pajak sebesar 5%");
            System.out.println(gaji - (gaji * 0.05));
        }else if(gaji >= 6000000){
            System.out.println("Dipotong Pajak sebesar 10%");
            System.out.println(gaji - (gaji * 0.1));
        }else{
            System.out.println("Tidak dikenakan Pajak");
        }
    }
}
