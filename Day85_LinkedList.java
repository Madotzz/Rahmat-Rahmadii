package day1_ngoding;

import java.util.*;

public class Day85_LinkedList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> anim = new LinkedList<>();
        System.out.print("Masukkan jumlah anime : ");
        int jml = input.nextInt();
        String nama;
        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan nama anime : ");
            nama = input.next();
            anim.add(nama);
        }

        System.out.println("List Anime yang di input");
        for (int i = 0; i < anim.size(); i++) {
            System.out.println(anim.get(i));
        }

        System.out.println("List anime setelah menghapus index pertama dan terakhir ");
        anim.removeFirst();
        anim.removeLast();
        System.out.println(anim);

        System.out.println("Apakah list anime kosong atau tidak? " + "\n" + anim.isEmpty());

    }
}
