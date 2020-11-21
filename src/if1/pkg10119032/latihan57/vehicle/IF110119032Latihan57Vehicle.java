/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119032.latihan57.vehicle;

/**
 *
 * @author Ginanjar Tubagus Gumilar
 * Nama     : Ginanjar Tubagus Gumilar
 * Kelas    : IF 1
 * NIM      : 10119032
 * Deskripsi Program : Berisi program deskripsi kendaraan
 * menggunakan konsep objek dan inheritance
 */
public class IF110119032Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle sepeda1 = new Bicycle();
        sepeda1.setBrand("Trek Bike");
        sepeda1.setModel("7.4FX");
        sepeda1.setGearCount(23);
        System.out.println("Brand : ".concat(sepeda1.getBrand()));
        System.out.println("Model : ".concat(sepeda1.getModel()));
        System.out.println("Jumlah Gear : " + sepeda1.getGearCount() + "\n");
        
        Skateboard skate1 = new Skateboard();
        skate1.setBrand("Ally Skate");
        skate1.setModel("Rocket");
        skate1.setBoardLength(54.5);
        System.out.println("Brand : ".concat(skate1.getBrand()));
        System.out.println("Model : ".concat(skate1.getModel()));
        System.out.println("Panjang Board : " + skate1.getBoardLength() + "\n");
        
        
        
    }
    
}