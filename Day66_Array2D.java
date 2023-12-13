package day1_ngoding;

public class Day66_Array2D {
    public static void main(String[] args) {
//      Menentukan rerata pada array 2 dimensi
        int[][] angka = {{9,8,7},{6,5,4},{3,2,1}};
        int jumlah = angka.length;
        int total = 0;
        System.out.print("Deret Angka : ");
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
                total += angka[i][j];
            }
        }
        System.out.println();
        double rata = total / jumlah;
        System.out.println("Totalnya adalah = " + total);
        System.out.println("Rata Rata = " + rata);
    }
}
