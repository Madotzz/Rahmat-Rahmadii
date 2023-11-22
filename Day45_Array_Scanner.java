package day1_ngoding;

import java.util.*;

public class Day45_Array_Scanner {
    public static void main(String[] args) {
//      Menginput nilai pada indeks array angka
        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Indeks ke-" + i + " = ");
            angka[i] = input.nextInt();
        }
        

                
    }
}
