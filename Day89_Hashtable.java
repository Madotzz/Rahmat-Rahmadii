package day1_ngoding;
import java.util.*;
public class Day89_Hashtable {
    public static void main(String[] args) {
        Hashtable<String, Integer> angka = new Hashtable<>();

        angka.put("Kunci1", 69);
        angka.put("Kunci2", 66);
        angka.put("Kunci3", 96);

        System.out.println("Nilai Kunci1: " + angka.get("Kunci1"));
        System.out.println("Nilai Kunci2: " + angka.get("Kunci2"));
        System.out.println("Nilai Kunci3: " + angka.get("Kunci3"));

        angka.remove("Kunci2");

        System.out.println("Hashtable setelah menghapus Kunci2:");
        for (Map.Entry<String, Integer> masuk : angka.entrySet()) {
            System.out.println("Kunci: " + masuk.getKey() + ", Nilai: " + masuk.getValue());
        }

    }
}
