/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stasiun;
class acaraTV {
    String StasiunTV;
    String Acara;
    
    public String getStasiunTV(){
        return StasiunTV;
    }
    public void setStasiunTV(String StasiunTV){
        this.StasiunTV=StasiunTV;
    }
    public String getAcara(){
        return Acara;
    }
    public void setAcara(String Acara){
        this.Acara=Acara;
    }
    public void cetak(){
        System.out.println("Acara "+Acara+" Stasiun TV "+StasiunTV);
    }
}
public class Stasiun {

    public static void main(String[] args) {
        acaraTV a=new acaraTV();
        
        a.StasiunTV="TransTV";
        a.Acara="Mozaik Islam";
        a.cetak();
    }
    
}
