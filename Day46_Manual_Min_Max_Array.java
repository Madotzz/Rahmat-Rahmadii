package day1_ngoding;
public class Day46_Manual_Min_Max_Array {
    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 450, 5, 6, 7, 8, 9};
        int jumlah = angka.length;
        int minimal = angka[0], maksimal = angka[0];
        System.out.print("Deret angka : ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
            if (angka[i] < minimal){
                minimal = angka[i];
            }
            if (angka[i] > maksimal){
                maksimal = angka[i];
            }
        }
        System.out.println();
        System.out.println("Nilai minimalnya adalah " + minimal);
        System.out.println("Nilai maksimalnya adalah " + maksimal);
    }
}
