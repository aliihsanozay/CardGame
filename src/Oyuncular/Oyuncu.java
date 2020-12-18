/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncular;

import Sporlar.Basketbolcu;
import Sporlar.Futbolcu;
import java.util.ArrayList;

/**
 *
 * @author aliihsanozay
 */
public abstract class Oyuncu {


    private String OyuncuAdi;    
    private int OyuncuID;
    private int Skor;
    private  ArrayList<Futbolcu> FKartListesi = new ArrayList<Futbolcu>();
    private  ArrayList<Basketbolcu> BKartListesi = new ArrayList<Basketbolcu>();
    
    public Oyuncu(){
        
    }
    
    public Oyuncu (String OyuncuAdi, int OyuncuID, int Skor){
        this.OyuncuAdi = OyuncuAdi;
        this.OyuncuID = OyuncuID;
        this.Skor = Skor;
    }
    

    public void SkorGoster(){
        
    }
    
    public abstract Futbolcu FKartSec();

    /**
     *
     * @return
     */
    public abstract Basketbolcu BKartSec();

    /**
     * @return the OyuncuAdi
     */
    public String getOyuncuAdi() {
        return OyuncuAdi;
    }

    /**
     * @param OyuncuAdi the OyuncuAdi to set
     */
    public void setOyuncuAdi(String OyuncuAdi) {
        this.OyuncuAdi = OyuncuAdi;
    }

    /**
     * @return the OyuncuID
     */
    public int getOyuncuID() {
        return OyuncuID;
    }

    /**
     * @param OyuncuID the OyuncuID to set
     */
    public void setOyuncuID(int OyuncuID) {
        this.OyuncuID = OyuncuID;
    }

    /**
     * @return the Skor
     */
    public int getSkor() {
        return Skor;
    }

    /**
     * @param Skor the Skor to set
     */
    public void setSkor(int Skor) {
        this.Skor = Skor;
    }

    /**
     * @return the FKartListesi
     */
    public ArrayList<Futbolcu> getFKartListesi() {
        return FKartListesi;
    }

    /**
     * @param FKartListesi the FKartListesi to set
     */
    public void setFKartListesi(ArrayList<Futbolcu> FKartListesi) {
        this.FKartListesi = FKartListesi;
    }

    /**
     * @return the BKartListesi
     */
    public ArrayList<Basketbolcu> getBKartListesi() {
        return BKartListesi;
    }

    /**
     * @param BKartListesi the BKartListesi to set
     */
    public void setBKartListesi(ArrayList<Basketbolcu> BKartListesi) {
        this.BKartListesi = BKartListesi;
    }
    

}
