package day1_ngoding;

import java.util.Scanner;

public class Day51_Latihan_Soal_Percabangan {
    public static void main(String[] args) {
//      Latihan soal percabangan
        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        String user = input.nextLine();
        System.out.print("Password : ");
        String pass = input.nextLine();
        if (user.equals("rahmat") && pass.equals("madi")){
            System.out.println("Login Sukses");
        }else {
            System.out.println("Login Gagal");
        }
    }
}
