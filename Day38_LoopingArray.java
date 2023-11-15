package day1_ngoding;
public class Day38_LoopingArray {
    public static void main(String[] args) {
//      Membuat Looping pada Array
        int[] angka = {2, 3, 5, 1, 7, 8, 2, 9};
        int jumlah = angka.length;
        for (int i = 0; i < jumlah; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println();
    }
}
