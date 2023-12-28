package day1_ngoding;

import java.util.*;

public class Day81_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Short> angka = new ArrayList<>();
        System.out.print("Masukkan index : ");
        int a = input.nextInt();
        short b = 0;
        for (int i = 0; i < a; i++) {
            System.out.print("Masukkan angka : ");
            b = input.nextShort();
            angka.add(b);
        }
        
        System.out.print("Masukkan index yang ingin dihapus : ");
        int c = input.nextInt();
        angka.remove(c);
        
        System.out.println("\nDeret angka setelah menghapus 1 index ");
        for (int i = 0; i < angka.size(); i++) {
            System.out.print(angka.get(i) + " ");
        }
        
        
    }
}
