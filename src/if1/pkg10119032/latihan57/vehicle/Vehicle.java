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
 * Deskripsi Program : Berisi superclass Vehicle
 */
public class Vehicle {
    protected String myBrand, myModel;

    public Vehicle() {
    }

    public String getBrand() {
        return myBrand;
    }

    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    public String getModel() {
        return myModel;
    }

    public void setModel(String model) {
        this.myModel = model;
    }
    
    
    
    
}