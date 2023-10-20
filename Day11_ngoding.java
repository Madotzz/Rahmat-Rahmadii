package day1_ngoding;

import java.util.Scanner;

public class Day11_ngoding {
    public static void main(String[] args) {
        int menu, harga = 0, porsi, total;
        Scanner input = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~ DAFTAR MENU ~~~~~~~~~~~~~");
        System.out.println("1. Nasi Kuning : Rp.7.000");
        System.out.println("2. Nasi Campur : Rp.10.000");
        System.out.println("3. Nasi Goreng : Rp.12.000");
        System.out.println("4. Ayam Geprek : Rp.12.000");
        System.out.println("Ket. Minimal memesan 1 Porsi");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.print("Pilih Menu Makanan : ");
        menu = input.nextInt();
        System.out.print("Pilih Porsi :");
        porsi = input.nextInt();
        
        if(menu == 1){
            System.out.println("Nasi Kuning");
            harga = 7000 * porsi;
        }else if (menu == 2){
            System.out.println("Nasi Campur");
            harga = 10000 * porsi;
        }else if (menu == 3){
            System.out.println("Nasi Goreng");
            harga = 12000 * porsi;
        }else if (menu == 4){
            System.out.println("Ayam Geprek");
            harga = 12000 * porsi;
        }else {
            System.out.println("Salah Memesan Makanan");
        }
        
        System.out.print("Total Harga : Rp." + harga);
        
        System.out.println();
    }
}
