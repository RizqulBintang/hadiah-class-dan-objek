/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanclass;



class buku
{
   String pengarang;
   String judul;
   
   void Isi(String isi1, String isi2){
       judul = isi1;
       pengarang = isi2;
   }
   void CetakKeLayar(){
       if(judul==null && pengarang ==null) return;
       System.out.println("Judul= "+judul+", Pengarang= "+pengarang);
   }
}

public class Latihanclass {
public static void main(String[] args) {
      buku a,b,c,d;
      a=b=c=d=new buku();
      a.Isi("Pemrograman Java", "Asep Herman");
      a.CetakKeLayar();
      b.Isi(null, null);
      b.CetakKeLayar();
      c.Isi(null, "johan");
      c.CetakKeLayar();
      d.Isi("Pemrograman web", null);
      d.CetakKeLayar();
    }
    
}
