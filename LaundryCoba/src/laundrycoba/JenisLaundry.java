/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrycoba;

/**
 *
 * @author HP
 */
public class JenisLaundry {
    private int idJenisLaundry, durasi;
    private String JenisLaundry;
    private double harga;

    public JenisLaundry(int idJenisLaundry, int durasi, String JenisLaundry, double harga) {
        this.idJenisLaundry = idJenisLaundry;
        this.durasi = durasi;
        this.JenisLaundry = JenisLaundry;
        this.harga = harga;
    }
    
    //implementasi enkapsulasi dengan pembuatan method utk mengakses data private "idJenisLaundry" */
    public int getIdJenisLaundry() {
        return idJenisLaundry;
    }
    
    public int getDurasi() {
        return durasi;
    }
    
    public String getJenisLaundry() {
        return JenisLaundry;
    }
    
    public double getHarga() {
        return harga;
    }
}