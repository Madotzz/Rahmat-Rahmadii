package day1_ngoding;

import java.util.Scanner;

public class Day18_ngoding {
    public static void main(String[] args) {
/*  Masih tentang perulangan, kali ini kita akan membuat program inputan perulangan 
    dengan jumlah angka yang habis dibagi 3 */
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka : ");
        int batas = input.nextInt();
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
 
}
