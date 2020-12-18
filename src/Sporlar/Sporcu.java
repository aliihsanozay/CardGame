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
public class Sporcu {
    

    
    private String SporcuIsim;
    private String SporcuTakim;
    
    public Sporcu(String SporcuIsim, String SporcuTakim) {
        this.SporcuIsim = SporcuIsim;
        this.SporcuTakim = SporcuTakim;
}

    public Sporcu(){
        
    }    
        
    public void SporcuPuaniGoster(){
        
    }

    /**
     * @return the SporcuIsim
     */
    public String getSporcuIsim() {
        return SporcuIsim;
    }

    /**
     * @param SporcuIsim the SporcuIsim to set
     */
    public void setSporcuIsim(String SporcuIsim) {
        this.SporcuIsim = SporcuIsim;
    }

    /**
     * @return the SporcuTakim
     */
    public String getSporcuTakim() {
        return SporcuTakim;
    }

    /**
     * @param SporcuTakim the SporcuTakim to set
     */
    public void setSporcuTakim(String SporcuTakim) {
        this.SporcuTakim = SporcuTakim;
    }
  
    
}
