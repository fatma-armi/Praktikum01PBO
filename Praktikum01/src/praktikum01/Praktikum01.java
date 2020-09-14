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
public class Praktikum01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JumlahKeramik p1 = new JumlahKeramik();
       
       p1.harga = 54000;
       p1.isi = 10;
       p1.merk = 'A';
       p1.sisiA = 30;
       p1.sisiB = 30;
       
       p1.hargaKeramik();
       
       JumlahKeramik p2 = new JumlahKeramik();
       p2.harga = 65000;
       p2.isi = 5;
       p2.merk = 'B';
       p2.sisiA = 40;
       p2.sisiB = 40;
       
       p2.hargaKeramik();
       
       JumlahKeramik p3 = new JumlahKeramik();
       p3.harga = 60000;
       p3.isi = 8;
       p3.merk = 'C';
       p3.sisiA = 30;
       p3.sisiB = 40;
       
       p3.hargaKeramik();
    }
    
}
