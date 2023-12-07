package day1_ngoding;
public class Day60_LatihanSoalArray2 {
    public static void main(String[] args) {
        int[][] data = {{24,55,45},{31,83,77},{68,99,23}};
        
        int min = 100;
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (min > data[i][j]){
                    min = data[i][j];
                }else if (max < data[i][j]){
                    max = data[i][j];
                }
            }
        }
        System.out.println("Nilai Minimal  : " + min);
        System.out.println("Nilai Maksimal : " + max);
    }
}
