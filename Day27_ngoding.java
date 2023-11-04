package day1_ngoding;

import java.util.Scanner;

public class Day27_ngoding {

    public static void main(String[] args) {
//      Latihan soal logika percabangan
        Scanner input = new Scanner(System.in);
        System.out.print("x1 : ");
        int x1 = input.nextInt();
        System.out.print("x2 : ");
        int x2 = input.nextInt();
        System.out.print("y1 : ");
        int y1 = input.nextInt();
        System.out.print("y2 : ");
        int y2 = input.nextInt();

        int hasil = (x1 - y1) + (x2 - y2);

        if (hasil < 0) {
            System.out.println("Hasil : " + (-1 * hasil));
        } else if (hasil > 0) {
            System.out.println("Hasil : " + (hasil));
        }
    }
}
