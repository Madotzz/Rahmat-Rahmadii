package day1_ngoding;
public class Day42_Rerata_Array {
    public static void main(String[] args) {
//      Menghitung rata rata pada array
        int [] angka = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int jumlah = angka.length;
        int total = 0;
        System.out.print("Deret angka : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
            total += angka[i];
        }
        System.out.println();
        double rata  = total / jumlah;
        System.out.println("Total : " + total);
        System.out.println("Rata rata : " + rata);
    }
}
