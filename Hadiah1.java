
package hadiah1;

import java.util.Scanner;

class luaslingkaran {
    double luas;
    int jari;
    void cetak() {
    System.out.println("Luas Lingkaran= " +luas);
    }
}
class volumekubus {
    int sisi;
    int volume;
    void cetak1(){
    System.out.println("Volume Kubus= "+volume);
    }
}

public class Hadiah1 {

    public static void main(String[] args) {
         luaslingkaran l=new luaslingkaran();
         volumekubus v=new volumekubus();
          Scanner input = new Scanner(System.in);
          System.out.println("Menghitung Luas Lingkaran");
          System.out.print("Masukan Jari-Jari: ");
          l.jari = input.nextInt();
          System.out.println();
          System.out.println("Menghitung Volume Kubus");
          System.out.print("Masukkan Sisi: ");
          v.sisi = input.nextInt();
 
          l.luas = 3.14*(l.jari*l.jari);
          v.volume = v.sisi*v.sisi*v.sisi;
          
          System.out.println();
          l.cetak();
          v.cetak1();
          
    }
    
}
