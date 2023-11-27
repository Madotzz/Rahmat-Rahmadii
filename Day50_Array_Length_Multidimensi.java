package day1_ngoding;
public class Day50_Array_Length_Multidimensi {
    public static void main(String[] args) {
//      Mencari jumlah index dalam masing-masing dimensi
        String[][] nama = {
            {"Rahmat ", "Rahmadi"},
            {"Muhammad ", "Taufik"},
            {"Abid ", "Norman"},
            {"Abd ", "Rahman"}
        };
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(nama[i][j]);
            }
            System.out.println();
        }
    }
}
