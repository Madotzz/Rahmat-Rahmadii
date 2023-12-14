package day1_ngoding;

import java.util.Random;
import java.util.Scanner;

public class Day67_Random_Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ukuran matriks 1: ");
        int a = input.nextInt();
        System.out.print("ukuran matriks 2: ");
        int b = input.nextInt();
        System.out.print("ukuran matriks 3: ");
        int c = input.nextInt();
        System.out.print("ukuran matriks 4: ");
        int d = input.nextInt();

        int[][][][] array = new int[a][b][c][d];

        Random r = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        array[i][j][k][l] = r.nextInt(100);

                    }

                }

            }

        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        System.out.print(array[i][j][k][l] + " ");
                    }
                    System.out.println();

                }
                System.out.println();

            }
            System.out.println();

        }

    }

}