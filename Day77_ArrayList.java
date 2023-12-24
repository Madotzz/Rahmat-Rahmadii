package day1_ngoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Day77_ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> name = new ArrayList<>();
        System.out.println("Masukkan index : ");
        int index = input.nextInt();
        String nama = null;
        for (int i = 0; i < index; i++) {
            System.out.println("Masukkan nama : ");
            nama = input.next();
            name.add(nama);
        }
        System.out.println("Daftar nama Yang di input : ");
        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }
        
        
        
    }
}
