/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sporlar;

/**
 *
 * @author aliihsanozay
 */
public class Basketbolcu extends Sporcu{
    
    private int Ikilik;
    private int Ucluk;
    private int SerbestAtis;
    private boolean KartKullanildiMi=false;
    
    public Basketbolcu (String BasketbolcuAdi, String BasketbolcuTakim, int Ikilik, int Ucluk, int SerbestAtis){
        super(BasketbolcuAdi,BasketbolcuTakim);
        this.Ikilik = Ikilik;
        this.Ucluk = Ucluk;
        this.SerbestAtis = SerbestAtis;
    }

    public Basketbolcu() {
       //To change body of generated methods, choose Tools | Templates.
    }
    
    
            
    @Override
    public void SporcuPuaniGoster(){
        
    }
    

    /**
     * @return the Ikilik
     */
    public int getIkilik() {
        return Ikilik;
    }

    /**
     * @param Ikilik the Ikilik to set
     */
    public void setIkilik(int Ikilik) {
        this.Ikilik = Ikilik;
    }

    /**
     * @return the Ucluk
     */
    public int getUcluk() {
        return Ucluk;
    }

    /**
     * @param Ucluk the Ucluk to set
     */
    public void setUcluk(int Ucluk) {
        this.Ucluk = Ucluk;
    }

    /**
     * @return the SerbestAtis
     */
    public int getSerbestAtis() {
        return SerbestAtis;
    }

    /**
     * @param SerbestAtis the SerbestAtis to set
     */
    public void setSerbestAtis(int SerbestAtis) {
        this.SerbestAtis = SerbestAtis;
    }
    
   
    /**
     * @return the KartKullanildiMi
     */
    public boolean isKartKullanildiMi() {
        return KartKullanildiMi;
    }

    /**
     * @param KartKullanildiMi the KartKullanildiMi to set
     */
    public void setKartKullanildiMi(boolean KartKullanildiMi) {
        this.KartKullanildiMi = KartKullanildiMi;
    }
    
}   
