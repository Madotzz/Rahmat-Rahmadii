package day1_ngoding;

import java.util.Scanner;

public class Day35_Input_Output_Array {
    public static void main(String[] args) {
//      Membuat Input dan Output pada Array
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan index : ");
        int index = input.nextInt();
        int angka[] = new int[index];
        System.out.println("Input : ");
        System.out.println("~~~~~~~~~~~~~~");
        for (int i = 0; i < index; i++) {
            System.out.print("Index ke-" + i +" = ");
            angka[i] = input.nextInt();
        }
        System.out.println("~~~~~~~~~~~~~~");
        System.out.println("Output : ");
        for (int i = 0; i < index; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}
