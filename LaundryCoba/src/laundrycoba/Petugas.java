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
public class Petugas extends Person {
    private int idPetugas;
    private String jabatan;
    
    public Petugas (int idPetugas, String jabatan, String nama, String alamat, String telepon){
        super (nama, alamat, telepon);
        this.idPetugas = idPetugas;
        this.jabatan = jabatan;
    }
     public int getIdPetugas() {
        return idPetugas;
    }
     
    public String getJabatan() {
        return jabatan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    
    public String getTelepon() {
        return telepon;
    }
}
