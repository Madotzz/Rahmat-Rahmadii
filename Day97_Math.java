package day1_ngoding;
import java.util.*;
public class Day97_Math {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas : ");
        int batas = input.nextInt();
        double[] angka = new double[batas];
        double a = 0;
        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan angka : ");
            a = input.nextInt();
            angka[i] = a;
        }
        System.out.print("[ ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        double min = 0;
        double max = 0;
        double pangkat = 0;
        for (int i = 0; i < angka.length; i++) {
            min = Math.min(min, angka[i]);
            max = Math.max(max, angka[i]);
            pangkat = Math.sqrt(angka[i]);
        }
        System.out.println(" } ");
        System.out.println("Angka minimalnya adalah : " + min);
        System.out.println("Angka maksimalnya adalah : " + max);
        System.out.println("Angka pangkatnya adalah : " + pangkat);
    }
}
