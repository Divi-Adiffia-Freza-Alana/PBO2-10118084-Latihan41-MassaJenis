/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan41.massajenis;

/**
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menghitung massa jenis

 */
public class PBO210118084Latihan41MassaJenis {
private static int volume,massajenis;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus Kubus = new Kubus();
        Kubus.setSisi(5);
        Kubus.setMassa(250);
        volume = Kubus.hitungVolume(Kubus.getSisi());
        massajenis = Kubus.hitungMassaJenis(Kubus.getMassa(), volume);
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi :" + Kubus.getSisi());
        System.out.println("Massa:" +Kubus.getMassa());
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume :" + volume);
        System.out.println("Volume :" + massajenis);
    }
    
}
