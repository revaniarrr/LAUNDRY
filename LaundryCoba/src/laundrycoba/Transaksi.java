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
public class Transaksi {
    JenisLaundry selectedLaundry;
    //jenis paket yang dipilih
    double jumlah;
    double total;

    public Transaksi(JenisLaundry selectedLaundry, double jumlah) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
        // getHarga didapatkan dari method yang ada pada class JenisLaundry 
        // digunakan untuk menghitung total sesuai dengan jenis laundry yang 
        //dipilih client
    }
    
}
    
    

