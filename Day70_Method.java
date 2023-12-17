package day1_ngoding;
public class Day70_Method {
    public static void main(String[] args) {
        // membuat program method menentukan luas segitiga
        int l = luas(10, 5);
        System.out.println(l);

      }
    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
      }
    }