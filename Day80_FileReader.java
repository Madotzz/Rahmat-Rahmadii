package day1_ngoding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day80_FileReader {
    public static void main(String[] args) throws IOException {
//      Membuat program membaca file
        FileReader baca;
        BufferedReader br;
        try{
            baca = new FileReader("D:\\RAHMAT RAHMADI\\000 NGODING\\Day1_ngoding\\src\\day1_ngoding\\rahmat.txt");
            br = new BufferedReader(baca);
            String baris;
            while ((baris = br.readLine()) != null){
                System.out.println(baris);
            }   
        }
        catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
