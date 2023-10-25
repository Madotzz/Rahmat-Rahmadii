package day1_ngoding;

import java.util.Scanner;

public class Day17_ngoding {
    public static void main(String[] args) {
//      Membuat program menghitung total penjumlahan jika nilai batas diketahui
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        int jumlah = 0;
        if (1 < batas){
            for (int i = 1; i < batas; i++) {
                jumlah+= i;
                System.out.print(i);
                if (i < batas - 1){
                    System.out.print("+");
                }
            }
            System.out.print("=" + jumlah);
            
        }
        System.out.println();
        
    }
}
