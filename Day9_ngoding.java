package day1_ngoding;
import java.util.Scanner;
//  Switch Case merupakan bentuk lain dari If-else if-else. Bedanya, percabangan ini menggunakan kata kunci 'switch' dan 'case' 
public class Day9_ngoding {
    public static void main(String[] args) {
//  Berikut adalah cara mengoperasikan switch case
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();
        
        int bilangan;
        switch (angka > 0 ? 1 : (angka < 0 ? -1 : 0)){
            case 1:
                bilangan = 1; //  Angka yang melebihi 1 adalah Bilangan Positif
                break;
            case -1:
                bilangan = -1; // Angka -1 kebawah adalah Bilangan Negatif
                break;
            default:
                bilangan = 0; // Angka nol
                break;
        }
        
        switch (bilangan){
            case 1:
                System.out.println("Bilangan Positif");
                break;
            case -1:
                System.out.println("Bilangan Negatif");
                break;
            default:
                System.out.println("Bilangan nol");
                break;
        }
    }
}
