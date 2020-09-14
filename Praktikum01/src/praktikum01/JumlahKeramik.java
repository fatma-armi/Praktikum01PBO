/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum01;

/**
 *
 * @author Isnaini Fatmala
 */
public class JumlahKeramik {
    /* membuat atribut */
    public char merk;
    public double sisiA;
    public double sisiB;
    public double harga;
    public double isi;
    
    /* membuat methods */
    public void hargaKeramik (){
        double bagi = 100 / ((this.sisiA * this.sisiB) / 10000);
        double jml = Math.ceil(bagi);
        double box = jml / this.isi;
        double boxActual = Math.ceil(box);
        double biaya = this.harga * boxActual;
        
        System.out.println("\n\nKeramik merk : " + this.merk);
        System.out.println("Jumlah keramik yang dibutuhkan : " + jml + " buah");
        System.out.println("Jumlah box yang dibutuhkan : " + boxActual + " box");
        System.out.println("Jumlah biaya keramik  : " + biaya + " rupiah");
    }

}
