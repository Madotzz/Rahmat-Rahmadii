package day1_ngoding;

import java.util.Scanner;

public class Day39_KalkulatorSwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka Pertama : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka Kedua   : ");
        int angka2 = input.nextInt();
        System.out.print("Masukkan Operator (+ - * /) : ");
        String operator = input.next();
        int hasil;
        switch (operator){
            case "+":
                hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan : " + hasil);
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan : " + hasil);
                break;
            case "*":
                hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian : " + hasil);
                break;
            case "/":
                hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian : " + hasil);
                break;
            default:
                System.out.println("Operator tidak Ditemukan");
                
                
        }
    }
}
