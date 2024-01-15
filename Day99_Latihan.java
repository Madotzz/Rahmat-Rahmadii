package day1_ngoding;
import java.util.*;

class Buah{
    private String namaBuah;
    private int jml;
    
    Buah(String namaBuah,int jml){
        this.namaBuah = namaBuah;
        this.jml = jml;
    }
    
    void setNama(String namaBuah){
        this.namaBuah = namaBuah;
        this.jml = jml;
    }
    void show(){
        System.out.println("Nama buah : " + namaBuah);
        System.out.println("Jumlah buah : " + jml);
    }
}
public class Day99_Latihan {
    public static void main(String[] args) {
        Buah buah1 = new Buah("Anggur", 10);
        Buah buah2 = new Buah("Apel", 9);
        Buah buah3 = new Buah("Alpukat", 8);
        Buah buah4 = new Buah("Mangga", 7);
        Buah buah5 = new Buah("Pisang", 6);
        Buah buah6 = new Buah("Sirsak", 5);
        Buah buah7 = new Buah("Jeruk", 4);
        Buah buah8 = new Buah("Semangka", 3);
        Buah buah9 = new Buah("Durian", 2);
        Buah buah10 = new Buah("Stroberi", 1);
        buah1.show();
        buah2.show();
        buah3.show();
        buah4.show();
        buah5.show();
        buah6.show();
        buah7.show();
        buah8.show();
        buah9.show();
        buah10.show();
        
        
        
    }
}
