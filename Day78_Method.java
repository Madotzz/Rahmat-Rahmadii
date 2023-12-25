package day1_ngoding;
public class Day78_Method {
//      Membuat program method menghitung luas dan keliling persegi
    public static int LuasPersegi(int sisi){
        int luas = sisi * sisi;
        return(luas);
    }
    
    public static int KelilingPersegi(int sisi){
        int keliling = 4 * sisi;
        return(keliling);
    }
    public static void main(String[] args) {
        int sisi = 6;
        System.out.println("Luas  : " + LuasPersegi(sisi));
        System.out.println("Keliling : " + KelilingPersegi(sisi));
    }
}
