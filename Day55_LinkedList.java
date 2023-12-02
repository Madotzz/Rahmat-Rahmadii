package day1_ngoding;

import java.util.LinkedList;

public class Day55_LinkedList {
    public static void main(String[] args) {
        /*
        LinkedList ialah program yang menyimpan data dalam bentuk node-node
        yang saling terkait satu sama lain
        */
        LinkedList <String> listAnime = new LinkedList<>();

        listAnime.add("Jujutsu Kaisen");
        listAnime.add("Konosuba");
        listAnime.add("Overlord");
        listAnime.add("Haikyuu!");
        listAnime.add("Hunter x Hunter");
        listAnime.add("Nanatsu no Taizai");
        listAnime.add("Shangri-La Frontier");
//      disini kita memasukkan elemen dalam LinkedList
        
        System.out.println("~~~~~List Anime Genre Action~~~~~");
        System.out.println(listAnime);
//      dan disini kita akan menampilkan semua elemen yang ada dalam LinkedList
    }
}
