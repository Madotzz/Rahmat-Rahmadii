package day1_ngoding;

import java.util.*;

public class Day88_LinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList <String> namaNegara = new LinkedList<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        String negara;
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan nama negara : ");
            negara = input.next();
            namaNegara.add(negara);
        }
        System.out.println("List nama Negara yang di input \n" + namaNegara);
        
        namaNegara.pollFirst();
        namaNegara.pollLast();
        System.out.println("List nama Negara setelah menghapus elemen pertama dan terakhir");
        System.out.println(namaNegara);
    }
}
