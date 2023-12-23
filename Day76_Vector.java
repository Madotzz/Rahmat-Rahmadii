package day1_ngoding;

import java.util.Enumeration;
import java.util.Vector;

public class Day76_Vector {
    public static void main(String[] args) {
        Enumeration day;
        Vector hari = new Vector();
        
        hari.add("Senin");
        hari.add("Selasa");
        hari.add("Rabu");
        hari.add("Kamis");
        hari.add("Jumat");
        hari.add("Sabtu");
        hari.add("Minggu");
        day = hari.elements();
        System.out.println("Hari");
        while (day.hasMoreElements()){
            System.out.println(day.nextElement());
        }
        
        
    }
}
