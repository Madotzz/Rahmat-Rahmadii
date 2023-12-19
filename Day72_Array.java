package day1_ngoding;

import java.util.*;

public class Day72_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];
        int angka = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan angka : ");
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
    }
}
