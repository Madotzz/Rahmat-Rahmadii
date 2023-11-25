package day1_ngoding;

import java.util.Scanner;

public class Day48_Array_String_Searching {
    public static void main(String[] args) {
//      Mencari menu yang ada pada Array String
        Scanner input = new Scanner(System.in);
        String[] menu = {"Nasi Kuning", "Nasi Goreng", "Nasi Uduk"};
        System.out.println("~~~~~Menu Makanan~~~~~");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Cari Menu : ");
        String cari = input.nextLine();
        int detect = 0;
        for (int i = 0; i < menu.length; i++) {
            if (cari.equalsIgnoreCase(menu[i])){
                System.out.println("Anda memesan " + menu[i]);
                detect++;
            }
        }
        if (detect == 0){
            System.out.println("Data tidak ditemukan !");
        }
    }
}
