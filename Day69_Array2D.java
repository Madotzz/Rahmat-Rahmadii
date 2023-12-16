package day1_ngoding;
public class Day69_Array2D {
    public static void main(String[] args) {
//      Menentukan nilai dan Status lulus/tidak lulus pada array 2 dimensi
        int[][] nilai = {{78,89,90},{35,45,50},{90,95,98}};
        System.out.println("~~~~~~Daftar Nilai dan Status~~~~~~");
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] >= 50){
                    System.out.println("Nilai : " + nilai[i][j] + "\nStatus : Lulus");
                }else {
                    System.out.println("Nilai : " + nilai[i][j] + "\nStatus : Tidak Lulus");
                }
            }
        }
    }
}
