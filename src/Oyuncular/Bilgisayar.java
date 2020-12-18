/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oyuncular;
import Sporlar.Basketbolcu;
import Sporlar.Futbolcu;
import java.util.Random;
import Ekran.Ekran;

/**
 *
 * @author aliihsanozay
 */
public class Bilgisayar extends Oyuncu{
    
   
    
    public Bilgisayar(String OyuncuAdi, int OyuncuID, int Skor) {
        super(OyuncuAdi, OyuncuID, Skor);
    }
    
    public Bilgisayar(){
        
    }
    
    @Override
    public Futbolcu FKartSec(){
        
        Random random = new Random();
        int n = random.nextInt(4);
        
        return getFKartListesi().get(n);
    }
    
    @Override
    public Basketbolcu BKartSec(){
        
        Random random = new Random();
        int n = random.nextInt(4);
        
        return getBKartListesi().get(n);
    }


    
}
