package day1_ngoding;

import java.util.Scanner;

public class Day19_ngoding {
    public static void main(String[] args) {
//       Membuat program yang dapat menerima inputan berupa angka
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        if (angka % 3 == 0) {
            System.out.println("Pride Of 3");
        }else if (angka % 5 == 0){
            System.out.println("Pride Of 5");
        }else {
            System.out.println("Master Class");
        }
    }
}
