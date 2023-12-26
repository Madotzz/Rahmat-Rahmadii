package day1_ngoding;

import java.util.ArrayList;
import java.util.Comparator;

public class Day79_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> angka = new ArrayList<>();
        
        angka.add(22);
        angka.add(79);
        angka.add(34);
        angka.add(56);
        angka.add(19);
        angka.add(100);
        System.out.println("Deret angka");
        for (int i = 0; i < angka.size(); i++) {
            System.out.println(angka.get(i));
        }
        
        System.out.println("Apakah angka 22 adalah elemen yang pertama di ArrayList?");
        System.out.println(angka.contains(22));
        
        System.out.println("Urutan nilai yang ada dalam ArrayList");
        angka.sort(Comparator.naturalOrder());
        System.out.println(angka);
    }
}
