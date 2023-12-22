package day1_ngoding;

import java.util.Scanner;

public class Day73_Latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan angka :");
            a = input.nextInt();
            if (a % 2 == 0){
                System.out.println("Genap");
            }else if (a % 2 == 1){
                System.out.println("Ganjil");
                break;
            }
        }

    }
}