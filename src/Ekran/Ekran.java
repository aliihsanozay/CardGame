/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ekran;

import Oyuncular.Bilgisayar;
import Oyuncular.Kullanici;
import Testler.Test;
import Sporlar.Basketbolcu;
import Sporlar.Futbolcu;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

/**
 *
 * @author aliihsanozay
 */
public class Ekran extends javax.swing.JFrame {

    Test test = new Test();
    Bilgisayar bilgisayar = new Bilgisayar("Bilgisayar",1,0);
    Kullanici kullanici = new Kullanici("Kullanıcı",3,0);
    Futbolcu futbolcu = new Futbolcu();
    Basketbolcu basketbolcu = new Basketbolcu();
    
    private boolean KartBilgi = true;
    
     
    public Ekran() {
        test.Futbolcular();
        test.Basketbolcular();
        test.KartDagıtma();
        
        kullanici.setFKartListesi(test.getKullaniciFutbol());
        kullanici.setBKartListesi(test.getKullaniciBasketbol());
        bilgisayar.setFKartListesi(test.getBilgisayarFutbol());
        bilgisayar.setBKartListesi(test.getBilgisayarBasketbol());
        
        initComponents();
        
        Bskor.setEditable(false);
        Kskor.setEditable(false);
        BilgisayarSkor.setEditable(false);
        KullaniciSkor.setEditable(false);
        KullaniciYazisi.setEditable(false);
        BilgisayarYazisi.setEditable(false);
     
        

    }
    
    public void BilgisayarBasketbolcuKartSecimi(){
        basketbolcu = bilgisayar.BKartSec();     
        if(basketbolcu.isKartKullanildiMi()==true){
            while(basketbolcu.isKartKullanildiMi()==true){
                basketbolcu = bilgisayar.BKartSec();
            }
        }
        BilgisayarKart.setText("<html><b>"+"Basketbolcu"+"</b><br> "+basketbolcu.getSporcuIsim()+" <br> "+basketbolcu.getSporcuTakim()+" <br> "+"İkilik: "+basketbolcu.getIkilik()+" <br> "+"Üçlük: "+basketbolcu.getUcluk()+" <br> "+"Serbest Atış: "+basketbolcu.getSerbestAtis()+ "</html>");
        
    }
    
    public void BilgisayarFutbolcuKartSecimi(){
        futbolcu = bilgisayar.FKartSec();
        if(futbolcu.isKartKullanildiMi()==true){
            while(futbolcu.isKartKullanildiMi()==true){
                futbolcu = bilgisayar.FKartSec();
            }
        }
        
    }
    
       
     public void BilgisayarKartAktifligi(){
          
         for(int i=0; i<4; i++){
             if(bilgisayar.getFKartListesi().get(i).getSporcuIsim() == futbolcu.getSporcuIsim()){
                 bilgisayar.getFKartListesi().get(i).setKartKullanildiMi(test.getFutbolcu().isKartKullanildiMi());
                 if(bilgisayar.getFKartListesi().get(i).isKartKullanildiMi()==true){
                     switch(i){

                        case 0:
                             BilgisayarKart1.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart1.setOpaque(true);
                             break;
                        case 1:
                             BilgisayarKart3.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart3.setOpaque(true);
                             break;
                        case 2:
                             BilgisayarKart5.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart5.setOpaque(true);
                             break;   
                        case 3:
                             BilgisayarKart7.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart7.setOpaque(true);
                             break;
                        }
                 }
                 
             }
         }
          
         
         for(int i=0; i<4; i++){
             if(bilgisayar.getBKartListesi().get(i).getSporcuIsim() == basketbolcu.getSporcuIsim()){
                 bilgisayar.getBKartListesi().get(i).setKartKullanildiMi(test.getBasketbolcu().isKartKullanildiMi());
                          
                 if(bilgisayar.getBKartListesi().get(i).isKartKullanildiMi()==true){
                     switch(i){

                        case 0:
                             BilgisayarKart2.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart2.setOpaque(true);
                             break;
                        case 1:
                             BilgisayarKart4.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart4.setOpaque(true);
                             break;
                        case 2:
                             BilgisayarKart6.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart6.setOpaque(true);
                             break;   
                        case 3:
                             BilgisayarKart8.setBackground(Color.LIGHT_GRAY);
                             BilgisayarKart8.setOpaque(true);
                             break;
                           }
                        }
                    }
                }
         
         
     }
        
         
   
    public void KartAktifligi(){
        
        boolean denetleyici1 = false ;
        boolean denetleyici2 = false;
                
        for(int i=0; i < 4; i++){
                if(kullanici.getFKartListesi().get(i).isKartKullanildiMi() == false) {
                     denetleyici1 = true;
                }
        }
                        
        for(int i=0; i < 4; i++){
                if(kullanici.getBKartListesi().get(i).isKartKullanildiMi() == false) {
                     denetleyici2= true;
                }
        }
        
        if(denetleyici1==false){
            KartBilgi=true;
        }
        
        if(denetleyici2 == false){
            KartBilgi=false;
            
        }
                                
                        
        if(KartBilgi==true){
            Kart1.setEnabled(false);
            Kart3.setEnabled(false);
            Kart5.setEnabled(false);
            Kart7.setEnabled(false); 
            if(kullanici.getBKartListesi().get(0).isKartKullanildiMi() == true){            
                Kart2.setEnabled(false);
            }
            else{            
                Kart2.setEnabled(true);
            }

            if(kullanici.getBKartListesi().get(1).isKartKullanildiMi() == true){            
                Kart4.setEnabled(false);
            }
            else{            
                Kart4.setEnabled(true);
            }
            if(kullanici.getBKartListesi().get(2).isKartKullanildiMi() == true){            
                Kart6.setEnabled(false);
            }
            else{            
                Kart6.setEnabled(true);
            }

            if(kullanici.getBKartListesi().get(3).isKartKullanildiMi() == true){            
                Kart8.setEnabled(false);
            }
            else{            
                Kart8.setEnabled(true);
            }
        }
          
        
        if(KartBilgi==false){
            Kart2.setEnabled(false);
            Kart4.setEnabled(false);
            Kart6.setEnabled(false);
            Kart8.setEnabled(false);
        
            if(kullanici.getFKartListesi().get(0).isKartKullanildiMi() == true){
                Kart1.setEnabled(false);
            }
            else{
                Kart1.setEnabled(true);
            } 

            if(kullanici.getFKartListesi().get(1).isKartKullanildiMi() == true){
                Kart3.setEnabled(false);
            }
            else{
                Kart3.setEnabled(true);
            }

            if(kullanici.getFKartListesi().get(2).isKartKullanildiMi() == true){
                Kart5.setEnabled(false);
            }
            else{
                Kart5.setEnabled(true);
            }

            if(kullanici.getFKartListesi().get(3).isKartKullanildiMi() == true){
                Kart7.setEnabled(false);
            }
            else{
                Kart7.setEnabled(true);
            }
            
        }
       
        
    }
    
   
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kart1 = new javax.swing.JButton();
        Kart2 = new javax.swing.JButton();
        Kart3 = new javax.swing.JButton();
        Kart4 = new javax.swing.JButton();
        Kart5 = new javax.swing.JButton();
        Kart6 = new javax.swing.JButton();
        Kart7 = new javax.swing.JButton();
        Kart8 = new javax.swing.JButton();
        KullaniciKart = new javax.swing.JLabel();
        BilgisayarKart = new javax.swing.JLabel();
        BilgisayarKart6 = new javax.swing.JLabel();
        BilgisayarKart4 = new javax.swing.JLabel();
        BilgisayarKart7 = new javax.swing.JLabel();
        BilgisayarKart5 = new javax.swing.JLabel();
        BilgisayarKart2 = new javax.swing.JLabel();
        BilgisayarKart3 = new javax.swing.JLabel();
        BilgisayarKart1 = new javax.swing.JLabel();
        BilgisayarKart8 = new javax.swing.JLabel();
        Başlat = new javax.swing.JButton();
        KullaniciSkor = new javax.swing.JTextField();
        Kskor = new javax.swing.JTextField();
        BilgisayarSkor = new javax.swing.JTextField();
        Bskor = new javax.swing.JTextField();
        Savas = new javax.swing.JButton();
        KarsilasacakYetenek = new javax.swing.JLabel();
        KullaniciYazisi = new javax.swing.JTextField();
        BilgisayarYazisi = new javax.swing.JTextField();
        Kazanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Kart1.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart1.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart1ActionPerformed(evt);
            }
        });

        Kart2.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart2.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart2ActionPerformed(evt);
            }
        });

        Kart3.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart3.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart3ActionPerformed(evt);
            }
        });

        Kart4.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart4.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart4ActionPerformed(evt);
            }
        });

        Kart5.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart5.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart5ActionPerformed(evt);
            }
        });

        Kart6.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart6.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart6ActionPerformed(evt);
            }
        });

        Kart7.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart7.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart7ActionPerformed(evt);
            }
        });

        Kart8.setMaximumSize(new java.awt.Dimension(99, 99));
        Kart8.setPreferredSize(new java.awt.Dimension(130, 170));
        Kart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Kart8ActionPerformed(evt);
            }
        });

        KullaniciKart.setMinimumSize(new java.awt.Dimension(99, 99));
        KullaniciKart.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart.setBackground(new java.awt.Color(255, 255, 255));
        BilgisayarKart.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart6.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart6.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart4.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart4.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart7.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart7.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart5.setToolTipText("");
        BilgisayarKart5.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart5.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart2.setBackground(new java.awt.Color(0, 0, 0));
        BilgisayarKart2.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart2.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart3.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart3.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart1.setBackground(new java.awt.Color(0, 153, 51));
        BilgisayarKart1.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart1.setPreferredSize(new java.awt.Dimension(130, 170));

        BilgisayarKart8.setMinimumSize(new java.awt.Dimension(99, 99));
        BilgisayarKart8.setPreferredSize(new java.awt.Dimension(130, 170));

        Başlat.setText("Başlat");
        Başlat.setMinimumSize(new java.awt.Dimension(90, 90));
        Başlat.setPreferredSize(new java.awt.Dimension(70, 50));
        Başlat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaşlatActionPerformed(evt);
            }
        });

        KullaniciSkor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        KullaniciSkor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        KullaniciSkor.setPreferredSize(new java.awt.Dimension(80, 80));

        Kskor.setBackground(new java.awt.Color(204, 0, 0));
        Kskor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Kskor.setForeground(new java.awt.Color(255, 255, 255));
        Kskor.setText("Kullanıcı Skor:");
        Kskor.setPreferredSize(new java.awt.Dimension(100, 30));

        BilgisayarSkor.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BilgisayarSkor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BilgisayarSkor.setPreferredSize(new java.awt.Dimension(80, 80));

        Bskor.setBackground(new java.awt.Color(204, 0, 0));
        Bskor.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        Bskor.setForeground(new java.awt.Color(255, 255, 255));
        Bskor.setText("Bilgisayar Skor:");
        Bskor.setPreferredSize(new java.awt.Dimension(100, 30));

        Savas.setText("Savaş");
        Savas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavasActionPerformed(evt);
            }
        });

        KarsilasacakYetenek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        KarsilasacakYetenek.setToolTipText("");

        KullaniciYazisi.setText("Kullanıcı");

        BilgisayarYazisi.setText("Bilgisayar");

        Kazanan.setBackground(new java.awt.Color(204, 0, 0));
        Kazanan.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Kazanan.setForeground(new java.awt.Color(0, 204, 0));
        Kazanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bskor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BilgisayarSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(212, 212, 212)
                                .addComponent(KullaniciYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BilgisayarKart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BilgisayarKart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BilgisayarKart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BilgisayarKart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BilgisayarKart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(BilgisayarKart6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BilgisayarKart7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BilgisayarKart8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Kart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Kart8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Kskor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(KullaniciSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Kazanan, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(KarsilasacakYetenek, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(KullaniciKart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(Savas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BilgisayarYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BilgisayarKart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Başlat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BilgisayarKart6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BilgisayarKart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bskor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BilgisayarSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Kazanan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Kskor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KullaniciSkor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BilgisayarYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KullaniciYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(KullaniciKart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BilgisayarKart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Savas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KarsilasacakYetenek, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Başlat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Kart2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kart8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Kart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Kart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart6ActionPerformed
        BilgisayarBasketbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Basketbolcu"+"</b><br> "+basketbolcu.getSporcuIsim()+" <br> "+basketbolcu.getSporcuTakim()+" <br> "+"İkilik: "+basketbolcu.getIkilik()+" <br> "+"Üçlük: "+basketbolcu.getUcluk()+" <br> "+"Serbest Atış: "+basketbolcu.getSerbestAtis()+ "</html>");
        KullaniciKart.setText(Kart6.getText());
          
       
        test.setBilgisayarBasketbolKarsilastirma(basketbolcu);
        test.setKullaniciBasketbolKarsilastirma(kullanici.getBKartListesi().get(2));
        
        test.setBasketbolcuDeger(2);
        test.setKartBilgisi(false);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
               
        KartBilgi = false;
                
    }//GEN-LAST:event_Kart6ActionPerformed

    private void Kart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart3ActionPerformed
                      
        BilgisayarFutbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Futbolcu"+"</b><br> "+futbolcu.getSporcuIsim()+" <br> "+futbolcu.getSporcuTakim()+" <br> "+"Penaltı: "+futbolcu.getPenalti()+" <br> "+"Serbest Atış: "+futbolcu.getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+futbolcu.getKaleciKarsiKarsiya()+ "</html>");
        KullaniciKart.setText(Kart3.getText());
                     
        test.setBilgisayarFutbolKarsilastirma(futbolcu);
        test.setKullaniciFutbolKarsilastirma(kullanici.getFKartListesi().get(1));
        
        test.setFutbolcuDeger(1);
        test.setKartBilgisi(true);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
        
        KartBilgi = true;
        
    }//GEN-LAST:event_Kart3ActionPerformed

    private void Kart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart1ActionPerformed
               
        BilgisayarFutbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Futbolcu"+"</b><br> "+futbolcu.getSporcuIsim()+" <br> "+futbolcu.getSporcuTakim()+" <br> "+"Penaltı: "+futbolcu.getPenalti()+" <br> "+"Serbest Atış: "+futbolcu.getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+futbolcu.getKaleciKarsiKarsiya()+ "</html>");
        KullaniciKart.setText(Kart1.getText());
        
                
        test.setBilgisayarFutbolKarsilastirma(futbolcu);
        test.setKullaniciFutbolKarsilastirma(kullanici.getFKartListesi().get(0));
        
        test.setFutbolcuDeger(0);
        test.setKartBilgisi(true);        
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
        
        KartBilgi = true;
                               
    }//GEN-LAST:event_Kart1ActionPerformed

    private void Kart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart2ActionPerformed
              
        BilgisayarBasketbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Basketbolcu"+"</b><br> "+basketbolcu.getSporcuIsim()+" <br> "+basketbolcu.getSporcuTakim()+" <br> "+"İkilik: "+basketbolcu.getIkilik()+" <br> "+"Üçlük: "+basketbolcu.getUcluk()+" <br> "+"Serbest Atış: "+basketbolcu.getSerbestAtis()+ "</html>");
        KullaniciKart.setText(Kart2.getText());
         
        test.setBilgisayarBasketbolKarsilastirma(basketbolcu);
        test.setKullaniciBasketbolKarsilastirma(kullanici.getBKartListesi().get(0));
        
        test.setBasketbolcuDeger(0);
        test.setKartBilgisi(false);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
        
        KartBilgi = false;
        
    }//GEN-LAST:event_Kart2ActionPerformed

    private void Kart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart4ActionPerformed
                    
        BilgisayarBasketbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Basketbolcu"+"</b><br> "+basketbolcu.getSporcuIsim()+" <br> "+basketbolcu.getSporcuTakim()+" <br> "+"İkilik: "+basketbolcu.getIkilik()+" <br> "+"Üçlük: "+basketbolcu.getUcluk()+" <br> "+"Serbest Atış: "+basketbolcu.getSerbestAtis()+ "</html>");
        KullaniciKart.setText(Kart4.getText());
                
        test.setBilgisayarBasketbolKarsilastirma(basketbolcu);
        test.setKullaniciBasketbolKarsilastirma(kullanici.getBKartListesi().get(1));
        
        test.setBasketbolcuDeger(1);
        test.setKartBilgisi(false);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
        
        KartBilgi = false;
                                    
    }//GEN-LAST:event_Kart4ActionPerformed

    private void Kart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart5ActionPerformed
           
        BilgisayarFutbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Futbolcu"+"</b><br> "+futbolcu.getSporcuIsim()+" <br> "+futbolcu.getSporcuTakim()+" <br> "+"Penaltı: "+futbolcu.getPenalti()+" <br> "+"Serbest Atış: "+futbolcu.getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+futbolcu.getKaleciKarsiKarsiya()+ "</html>");
        KullaniciKart.setText(Kart5.getText());
           
        test.setBilgisayarFutbolKarsilastirma(futbolcu);
        test.setKullaniciFutbolKarsilastirma(kullanici.getFKartListesi().get(2));
        
        test.setFutbolcuDeger(2);
        test.setKartBilgisi(true);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
                
        KartBilgi = true;
        
    }//GEN-LAST:event_Kart5ActionPerformed

    private void Kart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart7ActionPerformed
             
        BilgisayarFutbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Futbolcu"+"</b><br> "+futbolcu.getSporcuIsim()+" <br> "+futbolcu.getSporcuTakim()+" <br> "+"Penaltı: "+futbolcu.getPenalti()+" <br> "+"Serbest Atış: "+futbolcu.getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+futbolcu.getKaleciKarsiKarsiya()+ "</html>");
        KullaniciKart.setText(Kart7.getText());
        
        KartBilgi = true;
        KartAktifligi();
        
        test.setBilgisayarFutbolKarsilastirma(futbolcu);
        test.setKullaniciFutbolKarsilastirma(kullanici.getFKartListesi().get(3));
        
        test.setFutbolcuDeger(3);
        test.setKartBilgisi(true);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
                
        KartBilgi = true;
                        
    }//GEN-LAST:event_Kart7ActionPerformed

    private void Kart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Kart8ActionPerformed
               
        BilgisayarBasketbolcuKartSecimi();
        BilgisayarKart.setText("<html><b>"+"Basketbolcu"+"</b><br> "+basketbolcu.getSporcuIsim()+" <br> "+basketbolcu.getSporcuTakim()+" <br> "+"İkilik: "+basketbolcu.getIkilik()+" <br> "+"Üçlük: "+basketbolcu.getUcluk()+" <br> "+"Serbest Atış: "+basketbolcu.getSerbestAtis()+ "</html>");
        KullaniciKart.setText(Kart8.getText());
                
        test.setBilgisayarBasketbolKarsilastirma(basketbolcu);
        test.setKullaniciBasketbolKarsilastirma(kullanici.getBKartListesi().get(3));
        
        test.setBasketbolcuDeger(3);
        test.setKartBilgisi(false);
        test.YetenekSecme();
        KarsilasacakYetenek.setText(test.getKarsilasacakYetenek());
                
        KartBilgi = false;
       
                
    }//GEN-LAST:event_Kart8ActionPerformed

    private void BaşlatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaşlatActionPerformed
    Kart1.setText("<html><b>"+"Futbolcu"+"</b><br> "+kullanici.getFKartListesi().get(0).getSporcuIsim()+" <br> "+kullanici.getFKartListesi().get(0).getSporcuTakim()+" <br> "+"Penalti: "+kullanici.getFKartListesi().get(0).getPenalti()+" <br> "+"Serbest Atış: "+kullanici.getFKartListesi().get(0).getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+kullanici.getFKartListesi().get(0).getKaleciKarsiKarsiya()+ "</html>");
    Kart2.setText("<html><b>"+"Basketbolcu"+"</b><br> "+kullanici.getBKartListesi().get(0).getSporcuIsim()+" <br> "+kullanici.getBKartListesi().get(0).getSporcuTakim()+" <br> "+"İkilik: "+kullanici.getBKartListesi().get(0).getIkilik()+" <br> "+"Üçlük: "+kullanici.getBKartListesi().get(0).getUcluk()+" <br> "+"Serbest Atış: "+kullanici.getBKartListesi().get(0).getSerbestAtis()+ "</html>");
    Kart3.setText("<html><b>"+"Futbolcu"+"</b><br> "+kullanici.getFKartListesi().get(1).getSporcuIsim()+" <br> "+kullanici.getFKartListesi().get(1).getSporcuTakim()+" <br> "+"Penalti: "+kullanici.getFKartListesi().get(1).getPenalti()+" <br> "+"Serbest Atış: "+kullanici.getFKartListesi().get(1).getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+kullanici.getFKartListesi().get(1).getKaleciKarsiKarsiya()+ "</html>");
    Kart4.setText("<html><b>"+"Basketbolcu"+"</b><br> "+kullanici.getBKartListesi().get(1).getSporcuIsim()+" <br> "+kullanici.getBKartListesi().get(1).getSporcuTakim()+" <br> "+"İkilik: "+kullanici.getBKartListesi().get(1).getIkilik()+" <br> "+"Üçlük: "+kullanici.getBKartListesi().get(1).getUcluk()+" <br> "+"Serbest Atış: "+kullanici.getBKartListesi().get(1).getSerbestAtis()+ "</html>");
    Kart5.setText("<html><b>"+"Futbolcu"+"</b><br> "+kullanici.getFKartListesi().get(2).getSporcuIsim()+" <br> "+kullanici.getFKartListesi().get(2).getSporcuTakim()+" <br> "+"Penalti: "+kullanici.getFKartListesi().get(2).getPenalti()+" <br> "+"Serbest Atış: "+kullanici.getFKartListesi().get(2).getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+kullanici.getFKartListesi().get(2).getKaleciKarsiKarsiya()+ "</html>");
    Kart6.setText("<html><b>"+"Basketbolcu"+"</b><br> "+kullanici.getBKartListesi().get(2).getSporcuIsim()+" <br> "+kullanici.getBKartListesi().get(2).getSporcuTakim()+" <br> "+"İkilik: "+kullanici.getBKartListesi().get(2).getIkilik()+" <br> "+"Üçlük: "+kullanici.getBKartListesi().get(2).getUcluk()+" <br> "+"Serbest Atış: "+kullanici.getBKartListesi().get(2).getSerbestAtis()+ "</html>");
    Kart7.setText("<html><b>"+"Futbolcu"+"</b><br> "+kullanici.getFKartListesi().get(3).getSporcuIsim()+" <br> "+kullanici.getFKartListesi().get(3).getSporcuTakim()+" <br> "+"Penalti: "+kullanici.getFKartListesi().get(3).getPenalti()+" <br> "+"Serbest Atış: "+kullanici.getFKartListesi().get(3).getSerbestAtis()+" <br> "+"Kaleci ile Karşı Karşıya: "+kullanici.getFKartListesi().get(3).getKaleciKarsiKarsiya()+ "</html>");
    Kart8.setText("<html><b>"+"Basketbolcu"+"</b><br> "+kullanici.getBKartListesi().get(3).getSporcuIsim()+" <br> "+kullanici.getBKartListesi().get(3).getSporcuTakim()+" <br> "+"İkilik: "+kullanici.getBKartListesi().get(3).getIkilik()+" <br> "+"Üçlük: "+kullanici.getBKartListesi().get(3).getUcluk()+" <br> "+"Serbest Atış: "+kullanici.getBKartListesi().get(3).getSerbestAtis()+ "</html>");
    
    Kart1.setEnabled(true);
    Kart3.setEnabled(true);
    Kart5.setEnabled(true);
    Kart7.setEnabled(true);
    Kart2.setEnabled(false);
    Kart4.setEnabled(false);
    Kart6.setEnabled(false);
    Kart8.setEnabled(false);
    
    BilgisayarKart1.setBackground(Color.red);
    BilgisayarKart1.setOpaque(true);
    BilgisayarKart2.setBackground(Color.red);
    BilgisayarKart2.setOpaque(true);
    BilgisayarKart3.setBackground(Color.red);
    BilgisayarKart3.setOpaque(true);
    BilgisayarKart4.setBackground(Color.red);
    BilgisayarKart4.setOpaque(true);
    BilgisayarKart5.setBackground(Color.red);
    BilgisayarKart5.setOpaque(true);
    BilgisayarKart6.setBackground(Color.red);
    BilgisayarKart6.setOpaque(true);
    BilgisayarKart7.setBackground(Color.red);
    BilgisayarKart7.setOpaque(true);
    BilgisayarKart8.setBackground(Color.red);
    BilgisayarKart8.setOpaque(true);
        
    
    
    }//GEN-LAST:event_BaşlatActionPerformed

    private void SavasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavasActionPerformed
        KullaniciSkor.setText(Integer.toString(test.getKullaniciPuan()));
        BilgisayarSkor.setText(Integer.toString(test.getBilgisayarPuan()));
        BilgisayarKartAktifligi();
        KartAktifligi();
        
        
        if (test.getKullaniciPuan() + test.getBilgisayarPuan() ==80){
            if (test.getKullaniciPuan() < test.getBilgisayarPuan()){
                Kazanan.setText("Kazanan Bilgisayar!!!");
            }
            else if (test.getBilgisayarPuan() < test.getKullaniciPuan()){
                Kazanan.setText("Kazanan Kullanıcı!!!");
            }
            else{
                Kazanan.setText("Berabere!!!");
            }
            
        }   
    }//GEN-LAST:event_SavasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ekran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Başlat;
    private javax.swing.JLabel BilgisayarKart;
    private javax.swing.JLabel BilgisayarKart1;
    private javax.swing.JLabel BilgisayarKart2;
    private javax.swing.JLabel BilgisayarKart3;
    private javax.swing.JLabel BilgisayarKart4;
    private javax.swing.JLabel BilgisayarKart5;
    private javax.swing.JLabel BilgisayarKart6;
    private javax.swing.JLabel BilgisayarKart7;
    private javax.swing.JLabel BilgisayarKart8;
    private javax.swing.JTextField BilgisayarSkor;
    private javax.swing.JTextField BilgisayarYazisi;
    private javax.swing.JTextField Bskor;
    private javax.swing.JLabel KarsilasacakYetenek;
    private javax.swing.JButton Kart1;
    private javax.swing.JButton Kart2;
    private javax.swing.JButton Kart3;
    private javax.swing.JButton Kart4;
    private javax.swing.JButton Kart5;
    private javax.swing.JButton Kart6;
    private javax.swing.JButton Kart7;
    private javax.swing.JButton Kart8;
    private javax.swing.JLabel Kazanan;
    private javax.swing.JTextField Kskor;
    private javax.swing.JLabel KullaniciKart;
    private javax.swing.JTextField KullaniciSkor;
    private javax.swing.JTextField KullaniciYazisi;
    private javax.swing.JButton Savas;
    // End of variables declaration//GEN-END:variables

    

    
    

}
