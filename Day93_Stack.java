package day1_ngoding;
import java.util.*;
public class Day93_Stack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack <Integer> angka = new Stack<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        int a,b;
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan angka : ");
            b = input.nextInt();
            angka.push(b);
        }
        System.out.println(angka);
        System.out.println("=====PERNYATAAN=====");
        System.out.println("1. Mengetahui Stack yang kosong");
        System.out.println("2. Melihat elemen teratas/peek");
        System.out.println("3. Mencari elemen/search");
        System.out.println("====================");
        
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        System.out.println("====================");
        switch (pilih){
            case 1:
                System.out.println("Apakah isi Stack kosong? " + angka.isEmpty());
                break;
            case 2:
                System.out.println("Elemen teratas adalah : " + angka.peek());
                break;
            case 3:
                System.out.println("Masukkan elemen : ");
                int c = input.nextInt();
                int posisi = angka.search(c);
                if (posisi == -1){
                    System.out.println("Tidak ada");
                } else {
                    System.out.println("Ada");
                }
                break;
            default:
                System.out.println("Tidak ada dalam pernyataan");
        }
        int angka1 = angka.pop();
        int angka2 = angka.pop();
        System.out.println("=====KALKULATOR=====");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian   (*)");
        System.out.println("4. Pembagian   (/)");
        System.out.println("====================");
        System.out.print("Pilih Operasi : ");
        int d = input.nextInt();
        int e;
        System.out.print("\nHasil : ");
        switch (d){
            case 1:
                e = angka1 + angka2;
                System.out.print(angka1 + " + " + angka2 + " = " + e);
                break;
            case 2:
                e = angka1 - angka2;
                System.out.print(angka1 + " - " + angka2 + " = " + e);
                break;
            case 3:
                e = angka1 * angka2;
                System.out.print(angka1 + " * " + angka2 + " = " + e);
                break;
            case 4:
                e = angka1 / angka2;
                System.out.print(angka1 + " / " + angka2 + " = " + e);
                break;
            default:
                System.out.print("");
        }
        System.out.println();
        
    }
}
