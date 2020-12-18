/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncular;
import Sporlar.Basketbolcu;
import Sporlar.Futbolcu;

/**
 *
 * @author aliihsanozay
 */
public class Kullanici extends Oyuncu{
    
    public Kullanici(String OyuncuAdi, int OyuncuID, int Skor) {
        super(OyuncuAdi, OyuncuID, Skor);
    }
    public Kullanici(){
        
    }
    
    @Override
    public Futbolcu FKartSec(){
            
        return getFKartListesi().get(0);
    }
    @Override
    public Basketbolcu BKartSec(){
        
        return getBKartListesi().get(0);
    }

}
