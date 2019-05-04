package pln;

import java.util.Scanner;

class inputan{
    String nama;
    String alamat;
    int tipe;
    char blok;
    int bayar; 
    int kembali;
}

public class PLN {

    public static void main(String[] args) {
        inputan i=new inputan();
        Scanner input=new Scanner(System.in);
        System.out.println("Pembayaran PLN");
        System.out.print("Nama: ");
        i.nama=input.nextLine();
        System.out.print("Alamat: ");
        i.alamat=input.nextLine();
        System.out.print("Tipe Rumah: ");
        i.tipe=input.nextInt();
        
        
        switch(i.tipe){
            case 36:
                System.out.print("Blok: ");
                i.blok=input.next().charAt(0);
                if(i.blok=='A'){int A = 500000;
                System.out.println("Nama: "+i.nama);
                System.out.println("Alamat: "+i.alamat);
                System.out.println("Harga bayar: Rp.500.000");
                System.out.print("Bayar: ");
                i.bayar=input.nextInt();
                i.kembali=i.bayar-A;
                System.out.println("Kebalian: "+i.kembali);
                }
                else if(i.blok=='B'){int B = 300000;
                System.out.println("Nama: "+i.nama);
                System.out.println("Alamat: "+i.alamat);
                System.out.println("Harga bayar: Rp.300.000");
                System.out.print("Bayar: ");
                i.bayar=input.nextInt();
                i.kembali=i.bayar-B;
                System.out.println("Kebalian: "+i.kembali);
                }
            break;
            case 37:
                System.out.print("Blok: ");
                i.blok=input.next().charAt(0);
                if(i.blok=='A'){int A = 800000;
                System.out.println("Nama: "+i.nama);
                System.out.println("Alamat: "+i.alamat);
                System.out.println("Harga bayar: Rp.800.000");
                System.out.print("Bayar: ");
                i.bayar=input.nextInt();
                i.kembali=i.bayar-A;
                System.out.println("Kebalian: "+i.kembali);
                }
                else if(i.blok=='B'){int B = 600000;
                System.out.println("Nama: "+i.nama);
                System.out.println("Alamat: "+i.alamat);
                System.out.println("Harga bayar: Rp.600.000");
                System.out.print("Bayar: ");
                i.bayar=input.nextInt();
                i.kembali=i.bayar-B;
                System.out.println("Kebalian: "+i.kembali);
                }
            break;
            default:System.out.println("Tidak ada pilihan");
        }
        
    }
    
}
