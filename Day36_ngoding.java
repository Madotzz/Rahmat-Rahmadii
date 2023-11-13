package day1_ngoding;

import java.util.Scanner;

public class Day36_ngoding {
    public static void main(String[] args) {
//      Latihan soal Percabangan
        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        String user = input.nextLine();
        System.out.print("Password : ");
        String pass = input.nextLine();
        System.out.println("~~~~~~~~~~~~~");
        if (true){
            System.out.println("Login Sukses");
        }else{
            System.out.println("Login Gagal");
        }
    }
}
