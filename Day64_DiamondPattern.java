package day1_ngoding;

import java.util.Scanner;

public class Day64_DiamondPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan baris : ");
        int baris = input.nextInt();
        int spasi = baris - 1;
        int bintang = 1;
        
//      Setengah bagian atas dari pola diamond
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bintang; k++) {
                System.out.print("*");
            }
            System.out.println();
            spasi--;
            bintang += 2;
        }
        
//      Setengah bagian bawah dari pola diamond
        spasi = 1;
        bintang = baris * 2 - 3;
        
        for (int i = 1; i <= baris - 1; i++) {
            for (int j = 1; j <= spasi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= bintang; k++) {
                System.out.print("*");
            }
            System.out.println();
            spasi++;
            bintang -= 2;
        }
    }
}
