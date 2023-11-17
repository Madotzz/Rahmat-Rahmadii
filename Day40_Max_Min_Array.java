package day1_ngoding;
import java.util.Arrays;
import java.util.Collections;
public class Day40_Max_Min_Array {
    public static void main(String[] args) {
//      Menentukan nilai minimal dan maksimal pada array
        Integer[] angka = {12,34,56,78,90,21,23,24,25};
        int minimal = Collections.min(Arrays.asList(angka));
        int maksimal = Collections.max(Arrays.asList(angka));
        System.out.print("Deret angka : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        System.out.println("Nilai Minimalnya adalah : " + minimal);
        System.out.println("Nilai Maksimalnya adalah : " + maksimal);
    }
}
