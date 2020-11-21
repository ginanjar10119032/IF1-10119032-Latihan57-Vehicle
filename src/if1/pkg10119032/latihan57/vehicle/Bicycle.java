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
 * Deskripsi Program : Berisi subclass Bicycle
 */
public class Bicycle extends Vehicle {
    private int myGearCount;

    public Bicycle() {
        System.out.println("Bicycle");
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
    
    
}
