/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan50.energikinetik;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menghitung energi kinetik
 * dengan metode pendekatan berbasis objek
 */
public class EnergiKineteik {
    private double massa,kecepatan;
    private final double kecepatan1 = 0; 
    public double hasil,usaha;

    EnergiKineteik(double massa, double kecepatan) {
        this.massa=massa;
        this.kecepatan=kecepatan;
        
    }

    public double getUsaha() {
        return usaha = 1*massa*((kecepatan*kecepatan)-(kecepatan1*kecepatan1))/2;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getHasil() {
        return hasil=0.5*massa*kecepatan*kecepatan;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    
    
public void tampil(){
    System.out.println("Energi kinetik : "+getHasil());
    System.out.println("Usaha : "+getUsaha());
}
}
