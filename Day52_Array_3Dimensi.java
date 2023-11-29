package day1_ngoding;
public class Day52_Array_3Dimensi {
    public static void main(String[] args) {
        // Membuat array 3 dimensi
        int [][][] angka = new int [2][2][2];
        angka [0][0][0] = 1;
        angka [0][0][1] = 2;
        angka [0][1][0] = 3;
        angka [0][1][1] = 4;
        angka [1][0][0] = 5;
        angka [1][0][1] = 6;
        angka [1][1][0] = 7;
        angka [1][1][1] = 8;
        
        
        System.out.println(angka[0][0][0]);
        System.out.println(angka[0][0][1]);
        System.out.println(angka[0][1][0]);
        System.out.println(angka[0][1][1]);
        System.out.println(angka[1][0][0]);
        System.out.println(angka[1][0][1]);
        System.out.println(angka[1][1][0]);
        System.out.println(angka[1][1][1]);
    }
}