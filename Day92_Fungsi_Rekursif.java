package day1_ngoding;
import java.util.*;
public class Day92_Fungsi_Rekursif {
    public static void main(String[] args) {
//      Membuat program fungsi rekursif sederhana
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        System.out.println("Anda memasukkan nilai : " + nilai);
        
        printNilai(nilai);
    }
    
    private static void printNilai (int nilai){
        System.out.println("Nilai = " + nilai);
        if (nilai == 0){
            return;
        }
        nilai--;
        
        printNilai(nilai);
    }
}
