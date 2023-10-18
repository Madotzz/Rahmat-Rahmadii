package day1_ngoding;

import java.util.Scanner;

public class Day10_ngoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan golongan : ");
        String gol = input.nextLine();
        long gaji = 0;
        
        switch (gol){
            case "I":
                gaji = 4000000;
                break;
            case "II":
                gaji = 7000000;
                break;
            case "III":
                gaji = 10000000;
                break;
            default:
                System.out.println("Salah Input Golongan");
                return;
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("Masukkan Lama kerja : ");
        int laker = input.nextInt();
        long bonus = 0;
        
        if (laker > 5){
            bonus = 100000 * laker;
        }else{
            System.out.println("Tidak Dapat Bonus");
        }
        long gajitotal = gaji + bonus;
        System.out.print("Total gajinya adalah : " + gajitotal);
        
        System.out.println();
    }
}
