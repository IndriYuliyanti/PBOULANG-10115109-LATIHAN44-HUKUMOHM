/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan44.hukumohm;

/**
 *
 * @author nama : indri yuliyanti
 *          nim ; 10115109
 *          kelas : pbo ulng
 *          tugas pbo pert 4 menghitung ghukum ohm
 */
public class Baterai {
    private float kuatarus;
    private float hambatan;
    
    public Baterai(){
    }
    public Baterai(float kuatarus, float hambatan){
        this.kuatarus = kuatarus;
        this.hambatan = hambatan;
        
    }

    public float getKuatarus() {
        return kuatarus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
   public float hitungtegangan(){
       float tegangan;
       tegangan = kuatarus * hambatan;
       return tegangan;
       
   }
   
        
        
    }

