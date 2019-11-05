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
 *          tugas pbo pert 4 menghitung hukum ohm
 */
public class Pboulang10115109Latihan44Hukumohm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Baterai baterai1 = new Baterai(30,120);
        System.out.println("===== HUKUM OHM =====");
        System.out.println("kuat arus yang mengalir pada suatu kawat pengantar"
                +"\n akan berbanding lurus dengan beda potensial"
                +"\npada ujung ujung kawat pengantar tersebut"
                + "\nasalkan suhu kawat dijaga konstan:");
        System.out.println("kuat arus : "+baterai1.getKuatarus()+"ampere");
        System.out.println("hambatan :"+baterai1.getHambatan()+"OHM");
        System.out.println("hasil tegangan :"+baterai1.hitungtegangan()+"volt");
    }
}
