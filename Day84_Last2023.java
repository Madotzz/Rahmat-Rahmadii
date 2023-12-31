package day1_ngoding;  

import java.util.*;

class Benda{
    String benda;
    
    Benda(String benda){
        this.benda = benda;
    }
}

public class Day84_Last2023 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Benda> namaBenda= new ArrayList<>();
        System.out.print("Masukkan index : ");
        int index = input.nextInt();
        String a;
        for (int i = 0; i < index; i++) {
            System.out.println("Masukkan nama benda : ");
            a = input.next();
            namaBenda.add(new Benda(a));
        }
        System.out.println("Daftar nama benda");
        for (int i = 0; i < namaBenda.size(); i++) {
            System.out.println(namaBenda.get(i).benda);
        }
    }
}
