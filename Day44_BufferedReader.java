package isc_100dayscoding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day44_BufferedReader {
    public static void main(String[] args) throws IOException {
//      Menginput nama menggunakan BufferedReader
        InputStreamReader a = new InputStreamReader(System.in);
        BufferedReader rhmt = new BufferedReader(a);
        System.out.print("Nama  : ");
        String nama = rhmt.readLine();
        System.out.println("Nama saya " + nama);
    }
    
}