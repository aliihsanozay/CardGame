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
public class Futbolcu extends Sporcu{


   public Futbolcu (){
       
   }
    private int Penalti;
    private int SerbestAtis;
    private int KaleciKarsiKarsiya;
    private boolean KartKullanildiMi=false;
    
    
    public Futbolcu (String FutbolcuAdi, String FutbolcuTakim, int Penalti, int SerbestAtis, int KaleciKarsiKarsiya){
        super(FutbolcuAdi,FutbolcuTakim);
        this.Penalti = Penalti;
        this.SerbestAtis = SerbestAtis;
        this.KaleciKarsiKarsiya = KaleciKarsiKarsiya;
    }
    
      
    @Override
    public void SporcuPuaniGoster(){
        
    }
    
    
    
        /**
     * @return the Penalti
     */
    public int getPenalti() {
        return Penalti;
    }

    /**
     * @param Penalti the Penalti to set
     */
    public void setPenalti(int Penalti) {
        this.Penalti = Penalti;
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
     * @return the KaleciKarsiKarsiya
     */
    public int getKaleciKarsiKarsiya() {
        return KaleciKarsiKarsiya;
    }

    /**
     * @param KaleciKarsiKarsiya the KaleciKarsiKarsiya to set
     */
    public void setKaleciKarsiKarsiya(int KaleciKarsiKarsiya) {
        this.KaleciKarsiKarsiya = KaleciKarsiKarsiya;
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
    

