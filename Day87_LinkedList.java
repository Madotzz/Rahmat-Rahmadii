package day1_ngoding;
import java.util.*;
class DataMahasiswa {
        public String nama, nim;
        public  char kelas;
        public DataMahasiswa (String nama, String nim, char kelas){
            this.nama = nama;
            this.nim = nim;
            this.kelas = kelas;
        }
        public static String getNama(String nama) {
            return nama;
        }
        public static String getNim(String nim) {
            return nim;
        }        
        public static char getKelas(char kelas) {
            return kelas;
        }        
    }
public class Day87_LinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList <DataMahasiswa> dataMhs = new LinkedList<>();
        System.out.print("Masukkan batas inputan : ");
        int batas = input.nextInt();
        String nama,nim;
        char kelas = 'c';
        for (int i = 0; i < batas; i++) {
            System.out.print("Masukkan nama : ");
            nama = input.next();
            System.out.print("Masukkan nim : ");
            nim = input.next();
            dataMhs.add(new DataMahasiswa(nama,nim,kelas));
        }
        System.out.println("List Data Mahasiswa");
        for (int i = 0; i < dataMhs.size(); i++) {
            System.out.println("Nama  : " + dataMhs.get(i).nama);
            System.out.println("Nim   : " + dataMhs.get(i).nim);
            System.out.println("Kelas : " + dataMhs.get(i).kelas);
        }
    }
}
