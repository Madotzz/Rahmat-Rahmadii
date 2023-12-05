package day1_ngoding;

import java.util.Arrays;
import java.util.Scanner;

public class Day58_LatihanSoalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] data = new String[2][3];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == 0){
                    System.out.print("Masukkan Nama : ");
                    data[i][j] = input.next();
                }else if (j == 1){
                    System.out.print("Masukkan NIM : ");
                    data[i][j] = input.next();
                }else if (j == 2){
                    System.out.print("Masukkan Nilai : ");
                    data[i][j] = input.next();
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(data));
        
        
    }
}
