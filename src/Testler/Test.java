/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testler;


import Sporlar.Basketbolcu;
import Sporlar.Futbolcu;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author aliihsanozay
 */
public class Test {
    
    private Futbolcu futbolcu = new Futbolcu();
    private Basketbolcu basketbolcu = new Basketbolcu();

    private ArrayList<Futbolcu> FutbolcuListesi = new ArrayList<Futbolcu>();
    private ArrayList<Basketbolcu> BasketbolcuListesi = new ArrayList<Basketbolcu>();
    private ArrayList<Futbolcu> KullaniciFutbol = new ArrayList<Futbolcu>();
    private ArrayList<Futbolcu> BilgisayarFutbol = new ArrayList<Futbolcu>();
    private ArrayList<Basketbolcu> KullaniciBasketbol = new ArrayList<Basketbolcu>();
    private ArrayList<Basketbolcu> BilgisayarBasketbol = new ArrayList<Basketbolcu>();
    
    private boolean KartBilgisi;//true olunca futbolcu, false olunca basketbolcu kartı seçilmiş olur.
    private String KarsilasacakYetenek;
    private Futbolcu KullaniciFutbolKarsilastirma = new Futbolcu();
    private Futbolcu BilgisayarFutbolKarsilastirma = new Futbolcu();
    private Basketbolcu KullaniciBasketbolKarsilastirma = new Basketbolcu();
    private Basketbolcu BilgisayarBasketbolKarsilastirma = new Basketbolcu();
    private int BilgisayarPuan = 0;
    private int KullaniciPuan = 0;
    
    private int FutbolcuDeger;
    private int BasketbolcuDeger;
    
    
    
    
    public Test(){
        
    }
    
    public void Futbolcular() {
        Futbolcu FK1 = new Futbolcu("Ronaldinho", "Barcelona", 95, 100, 95 );
        Futbolcu FK2 = new Futbolcu("C.Ronaldo","Real Madrid",90,90,90);
        Futbolcu FK3 = new Futbolcu("Messi","Barcelona",85,90,95);
        Futbolcu FK4 = new Futbolcu("Ibrahimovic","Milan",80,85,85);
        Futbolcu FK5 = new Futbolcu("Alex De Souza","Fenerbahçe",90,85,85);
        Futbolcu FK6 = new Futbolcu("Arda Turan","Galatasaray",80,75,80);
        Futbolcu FK7 = new Futbolcu("Cenk Tosun","Beşiktaş",80,80,80);
        Futbolcu FK8 = new Futbolcu("Neymar","PSG",85,80,90);
        
        FutbolcuListesi.add(FK1);
        FutbolcuListesi.add(FK2);
        FutbolcuListesi.add(FK3);
        FutbolcuListesi.add(FK4);
        FutbolcuListesi.add(FK5);
        FutbolcuListesi.add(FK6);
        FutbolcuListesi.add(FK7);
        FutbolcuListesi.add(FK8);        
             
    }

    public void Basketbolcular() {
        
        Basketbolcu BK1 = new Basketbolcu(" LeBron James","Lakers",95,100,95);
        Basketbolcu BK2 = new Basketbolcu("James Harden","Rockets",90,90,90);
        Basketbolcu BK3 = new Basketbolcu(" Nikola Jokic","Nuggets",85,90,95);
        Basketbolcu BK4 = new Basketbolcu("Stephen Curry","Warriors",80,85,85);
        Basketbolcu BK5 = new Basketbolcu("Luka Doncic","Mavericks",90,85,85);
        Basketbolcu BK6 = new Basketbolcu("Pascal Siakam","Raptors",80,75,80);
        Basketbolcu BK7 = new Basketbolcu("Jimmy Butler","Heat",80,80,80);
        Basketbolcu BK8 = new Basketbolcu("Jayson Tatum","Celtics",85,80,90);

        BasketbolcuListesi.add(BK1);
        BasketbolcuListesi.add(BK2);
        BasketbolcuListesi.add(BK3);
        BasketbolcuListesi.add(BK4);
        BasketbolcuListesi.add(BK5);
        BasketbolcuListesi.add(BK6);
        BasketbolcuListesi.add(BK7);
        BasketbolcuListesi.add(BK8);

    }

    public void KartDagıtma() {

        Random RandomListe = new Random();

        for(int i=0; i<8; i++){
            int x = RandomListe.nextInt(FutbolcuListesi.size());
            
            if(i<4){
                getKullaniciFutbol().add(FutbolcuListesi.get(x));             
            }            
            if(i>3){
                getBilgisayarFutbol().add(FutbolcuListesi.get(x));
            }
            FutbolcuListesi.remove(x);
        }
        
        for(int i=0; i<8; i++){
            int y = RandomListe.nextInt(BasketbolcuListesi.size());
            
            if(i<4){
                getKullaniciBasketbol().add(BasketbolcuListesi.get(y));             
            }
            if(i>3){
                getBilgisayarBasketbol().add(BasketbolcuListesi.get(y));             
            }          
            BasketbolcuListesi.remove(y);
        }        

    }
    


    
    public void YetenekSecme(){
        
        Random random = new Random();
        

     
        if (KartBilgisi == true) {
                                    
            int FutbolYetenek = random.nextInt(3);
            
        
            switch (FutbolYetenek) {
                
                case 0:
                    KarsilasacakYetenek = "<html><b>"+"Penaltı"+"</b></html>";
                    if((KullaniciFutbolKarsilastirma.getPenalti()) < (BilgisayarFutbolKarsilastirma.getPenalti())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    }
                    
                    else if((KullaniciFutbolKarsilastirma.getPenalti()) > (BilgisayarFutbolKarsilastirma.getPenalti())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    } 
                    else {
                        futbolcu.setKartKullanildiMi(false);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(false);
                    }
                    break;
                    
                case 1:
                    KarsilasacakYetenek = "<html><b>"+"Serbest Atış"+"</b></html>"; 
                    if((KullaniciFutbolKarsilastirma.getSerbestAtis()) < (BilgisayarFutbolKarsilastirma.getSerbestAtis())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    }
                    
                    else if((KullaniciFutbolKarsilastirma.getSerbestAtis()) > (BilgisayarFutbolKarsilastirma.getSerbestAtis())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    } 
                    else {
                        futbolcu.setKartKullanildiMi(false);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(false);
                    }
                    break;
                    
                case 2:
                    KarsilasacakYetenek = "<html><b>"+"Kaleci ile Karşı Karşıya"+"</b></html>";
                    if((KullaniciFutbolKarsilastirma.getKaleciKarsiKarsiya()) < (BilgisayarFutbolKarsilastirma.getKaleciKarsiKarsiya())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    }
                    
                    else if((KullaniciFutbolKarsilastirma.getKaleciKarsiKarsiya()) > (BilgisayarFutbolKarsilastirma.getKaleciKarsiKarsiya())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        futbolcu.setKartKullanildiMi(true);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(true);
                    }
                    else {
                        futbolcu.setKartKullanildiMi(false);
                        getKullaniciFutbol().get(FutbolcuDeger).setKartKullanildiMi(false);
                    }
                    break;                 
            }
       
        }
         if(KartBilgisi == false) {
            
            int BasketbolYetenek = random.nextInt(3);
        
            switch (BasketbolYetenek) {
                
                case 0:
                    KarsilasacakYetenek = "<html><b>"+"İkilik"+"</b></html>";
                    if((KullaniciBasketbolKarsilastirma.getIkilik()) < (BilgisayarBasketbolKarsilastirma.getIkilik())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                        
                    }
                    
                    else if((KullaniciBasketbolKarsilastirma.getIkilik()) > (BilgisayarBasketbolKarsilastirma.getIkilik())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                    }     
                    else {
                        basketbolcu.setKartKullanildiMi(false);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(false);
                    }
                    break;
                    
                case 1:
                    KarsilasacakYetenek = "<html><b>"+"Üçlük"+"</b></html>";
                    if((KullaniciBasketbolKarsilastirma.getUcluk()) < (BilgisayarBasketbolKarsilastirma.getUcluk())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                    }
                    
                    else if((KullaniciBasketbolKarsilastirma.getUcluk()) > (BilgisayarBasketbolKarsilastirma.getUcluk())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                    }
                    else {
                        basketbolcu.setKartKullanildiMi(false);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(false);
                    }                    
                     break;
                     
                case 2:
                    KarsilasacakYetenek = "<html><b>"+"Serbest Atış"+"</b></html>";
                    if((KullaniciBasketbolKarsilastirma.getSerbestAtis()) < (BilgisayarBasketbolKarsilastirma.getSerbestAtis())){
                        
                        BilgisayarPuan = BilgisayarPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                    }
                    
                    else if((KullaniciBasketbolKarsilastirma.getSerbestAtis()) > (BilgisayarBasketbolKarsilastirma.getSerbestAtis())){
                        
                        KullaniciPuan = KullaniciPuan + 10;
                        basketbolcu.setKartKullanildiMi(true);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(true);
                    }
                    else {
                        basketbolcu.setKartKullanildiMi(false);
                        getKullaniciBasketbol().get(BasketbolcuDeger).setKartKullanildiMi(false);
                    }
                    break;
                 
            }
        }
        
    }


    /**
     * @return the KullaniciFutbol
     */
    public ArrayList<Futbolcu> getKullaniciFutbol() {
        return KullaniciFutbol;
    }

    /**
     * @param KullaniciFutbol the KullaniciFutbol to set
     */
    public void setKullaniciFutbol(ArrayList<Futbolcu> KullaniciFutbol) {
        this.KullaniciFutbol = KullaniciFutbol;
    }

    /**
     * @return the KullaniciBasketbol
     */
    public ArrayList<Basketbolcu> getKullaniciBasketbol() {
        return KullaniciBasketbol;
    }

    /**
     * @param KullaniciBasketbol the KullaniciBasketbol to set
     */
    public void setKullaniciBasketbol(ArrayList<Basketbolcu> KullaniciBasketbol) {
        this.KullaniciBasketbol = KullaniciBasketbol;
    }

    /**
     * @return the BilgisayarFutbol
     */
    public ArrayList<Futbolcu> getBilgisayarFutbol() {
        return BilgisayarFutbol;
    }

    /**
     * @param BilgisayarFutbol the BilgisayarFutbol to set
     */
    public void setBilgisayarFutbol(ArrayList<Futbolcu> BilgisayarFutbol) {
        this.BilgisayarFutbol = BilgisayarFutbol;
    }

    /**
     * @return the BilgisayarBasketbol
     */
    public ArrayList<Basketbolcu> getBilgisayarBasketbol() {
        return BilgisayarBasketbol;
    }

    /**
     * @param BilgisayarBasketbol the BilgisayarBasketbol to set
     */
    public void setBilgisayarBasketbol(ArrayList<Basketbolcu> BilgisayarBasketbol) {
        this.BilgisayarBasketbol = BilgisayarBasketbol;
    }

    /**
     * @return the KartBilgisi
     */
    public boolean isKartBilgisi() {
        return KartBilgisi;
    }

    /**
     * @param KartBilgisi the KartBilgisi to set
     */
    public void setKartBilgisi(boolean KartBilgisi) {
        this.KartBilgisi = KartBilgisi;
    }

    /**
     * @return the KarsilasacakYetenek
     */
    public String getKarsilasacakYetenek() {
        return KarsilasacakYetenek;
    }

    /**
     * @param KarsilasacakYetenek the KarsilasacakYetenek to set
     */
    public void setKarsilasacakYetenek(String KarsilasacakYetenek) {
        this.KarsilasacakYetenek = KarsilasacakYetenek;
    }

    /**
     * @return the KullaniciFutbolKarsilastirma
     */
    public Futbolcu getKullaniciFutbolKarsilastirma() {
        return KullaniciFutbolKarsilastirma;
    }

    /**
     * @param KullaniciFutbolKarsilastirma the KullaniciFutbolKarsilastirma to set
     */
    public void setKullaniciFutbolKarsilastirma(Futbolcu KullaniciFutbolKarsilastirma) {
        this.KullaniciFutbolKarsilastirma = KullaniciFutbolKarsilastirma;
    }

    /**
     * @return the BilgisayarFutbolKarsilastirma
     */
    public Futbolcu getBilgisayarFutbolKarsilastirma() {
        return BilgisayarFutbolKarsilastirma;
    }

    /**
     * @param BilgisayarFutbolKarsilastirma the BilgisayarFutbolKarsilastirma to set
     */
    public void setBilgisayarFutbolKarsilastirma(Futbolcu BilgisayarFutbolKarsilastirma) {
        this.BilgisayarFutbolKarsilastirma = BilgisayarFutbolKarsilastirma;
    }

    /**
     * @return the KullaniciBasketbolKarsilastirma
     */
    public Basketbolcu getKullaniciBasketbolKarsilastirma() {
        return KullaniciBasketbolKarsilastirma;
    }

    /**
     * @param KullaniciBasketbolKarsilastirma the KullaniciBasketbolKarsilastirma to set
     */
    public void setKullaniciBasketbolKarsilastirma(Basketbolcu KullaniciBasketbolKarsilastirma) {
        this.KullaniciBasketbolKarsilastirma = KullaniciBasketbolKarsilastirma;
    }

    /**
     * @return the BilgisayarBasketbolKarsilastirma
     */
    public Basketbolcu getBilgisayarBasketbolKarsilastirma() {
        return BilgisayarBasketbolKarsilastirma;
    }

    /**
     * @param BilgisayarBasketbolKarsilastirma the BilgisayarBasketbolKarsilastirma to set
     */
    public void setBilgisayarBasketbolKarsilastirma(Basketbolcu BilgisayarBasketbolKarsilastirma) {
        this.BilgisayarBasketbolKarsilastirma = BilgisayarBasketbolKarsilastirma;
    }

    /**
     * @return the BilgisayarPuan
     */
    public int getBilgisayarPuan() {
        return BilgisayarPuan;
    }

    /**
     * @param BilgisayarPuan the BilgisayarPuan to set
     */
    public void setBilgisayarPuan(int BilgisayarPuan) {
        this.BilgisayarPuan = BilgisayarPuan;
    }

    /**
     * @return the KullaniciPuan
     */
    public int getKullaniciPuan() {
        return KullaniciPuan;
    }

    /**
     * @param KullaniciPuan the KullaniciPuan to set
     */
    public void setKullaniciPuan(int KullaniciPuan) {
        this.KullaniciPuan = KullaniciPuan;
    }

    /**
     * @return the futbolcu
     */
    public Futbolcu getFutbolcu() {
        return futbolcu;
    }

    /**
     * @param futbolcu the futbolcu to set
     */
    public void setFutbolcu(Futbolcu futbolcu) {
        this.futbolcu = futbolcu;
    }

    /**
     * @return the basketbolcu
     */
    public Basketbolcu getBasketbolcu() {
        return basketbolcu;
    }

    /**
     * @param basketbolcu the basketbolcu to set
     */
    public void setBasketbolcu(Basketbolcu basketbolcu) {
        this.basketbolcu = basketbolcu;
    }

    /**
     * @return the FutbolcuDeger
     */
    public int getFutbolcuDeger() {
        return FutbolcuDeger;
    }

    /**
     * @param FutbolcuDeger the FutbolcuDeger to set
     */
    public void setFutbolcuDeger(int FutbolcuDeger) {
        this.FutbolcuDeger = FutbolcuDeger;
    }

    /**
     * @return the BasketbolcuDeger
     */
    public int getBasketbolcuDeger() {
        return BasketbolcuDeger;
    }

    /**
     * @param BasketbolcuDeger the BasketbolcuDeger to set
     */
    public void setBasketbolcuDeger(int BasketbolcuDeger) {
        this.BasketbolcuDeger = BasketbolcuDeger;
    }



    }   

