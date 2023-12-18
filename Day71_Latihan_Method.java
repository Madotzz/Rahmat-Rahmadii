package day1_ngoding;

import java.util.Scanner;

public class Day71_Latihan_Method {
    public static void operator (int angka1, int angka2){
       int hasil;
       hasil = angka1 + angka2;
       System.out.println(angka1 + " + " + angka2 + " = " + hasil);
       hasil = angka1 - angka2;
       System.out.println(angka1 + " - " + angka2 + " = " + hasil);
       hasil = angka1 * angka2;
       System.out.println(angka1 + " x " + angka2 + " = " + hasil);
       hasil = angka1 / angka2;
       System.out.println(angka1 + " / " + angka2 + " = " + hasil);
       hasil = angka1 % angka2;
       System.out.println(angka1 + " % " + angka2 + " = " + hasil);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int angka2 = input.nextInt();
        System.out.println("Output : ");
        operator(angka1, angka2);
    }
}
