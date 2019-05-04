
package demobuku;

class Buku
{
    String judul;
    String pengarang;
}
public class DemoBuku {

    public static void main(String[] args) {
        Buku a,b;
        a=new Buku();
        b=new Buku();
        
        a.pengarang="Felix Siauw";
        a.judul="Beyond The Inspiration";
        b.pengarang="Bidu Raharjo";
        b.judul="Mudah Belajar Java";
        System.out.println("Judul: "+a.judul+" Pengarang: "+a.pengarang);
        System.out.println("Judul: "+b.judul+" Pengarang: "+b.pengarang);
    }
    
}
