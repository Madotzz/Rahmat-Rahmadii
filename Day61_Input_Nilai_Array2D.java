package day1_ngoding;

import java.util.Scanner;

public class Day61_Input_Nilai_Array2D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nilai = new int[2][2];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Masukkan nilai : ");
                nilai[i][j] = input.nextInt();
                if (nilai[i][j] >= 90 && nilai[i][j] <= 100) {
                    System.out.println("Predikat A");
                } else if (nilai[i][j] >= 75 && nilai[i][j] <= 89) {
                    System.out.println("Predikat B");
                } else if (nilai[i][j] >= 65 && nilai[i][j] <= 74) {
                    System.out.println("Predikat C");
                } else {
                    System.out.println("Nilai Error");
                }
            }
        }
    }
}
