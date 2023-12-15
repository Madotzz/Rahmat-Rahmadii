package day1_ngoding;

import java.util.Scanner;

public class Day68_Format_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kalimat 1 : ");
        String kalimat = input.nextLine();
        
        System.out.println("\n mengambil komponen dari String");
        System.out.println(kalimat.charAt(3));
        
        System.out.println("\n substring");
        String kata = kalimat.substring(5, 10);
        System.out.println(kata);
        
        System.out.println("\n concat");
        String kalimat1 = kata + " bagus";
        System.out.println(kalimat1);
        
        System.out.println();
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());
        
        System.out.println("\n Masukkan kalimat ke 2 = ");
        String kalimat2 = input.nextLine();
        
        if (kalimat.equals(kalimat2)){
            System.out.println("Kalimat 1 dan 2 sama");
        }else {
            System.out.println("Kalimat 1 dan 2 tidak sama");
        }
     }
}
