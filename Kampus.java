
package kampus;

import java.util.Scanner;

class Siswa{
    String nama;
    String jurusan;
    String nim;
    
    void cetak(){
        System.out.println("nama saya adalah " +nama+
        " jurusan saya adalah "+jurusan+" dan nim saya "+nim);
    }
}
public class Kampus {

    public static void main(String[] args) {
        Siswa s=new Siswa();
        Scanner input=new Scanner(System.in);
        System.out.print("Nama: ");
        s.nama=input.nextLine();
        System.out.print("Jurusan: ");
        s.jurusan=input.nextLine();
        System.out.print("NIM: ");
        s.nim=input.nextLine();
        s.cetak();
    }
    
}
