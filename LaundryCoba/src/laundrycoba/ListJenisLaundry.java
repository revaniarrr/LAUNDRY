/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundrycoba;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ListJenisLaundry extends List{
    /** pemeberian nilai pada array "list" dengan tipe class JenisLaundry */
    JenisLaundry[] listLaundry = {
      new JenisLaundry(1, 1,  "Pakaian", 5000),
      new JenisLaundry(2, 1, "Selimut", 10000),
      new JenisLaundry(3, 2, "Boneka", 20000),
    };
    
    /** method untuk menampilkan data list jenis landry */
    @Override
    public void viewData(){
        System.out.println("--- List Laundry ---");
        System.out.println("ID \t Jenis \t Harga \t Durasi");
        for (int i = 0; i < listLaundry.length; i++) {
            System.out.println(listLaundry[i].getIdJenisLaundry() +" \t "
            + listLaundry[i].getJenisLaundry() + " \t "
            + listLaundry[i].getHarga() + " \t "
            + listLaundry[i].getDurasi());
        }
    }
    
    public int cariJenisLaundry(int id){
        int foundIndex = 0;
        /** pencarian data berdasarkan id */
        for (int i = 0; i < listLaundry.length; i++) {
            
            /** jika id yang dicari ditemukan */
            if(listLaundry[i].getIdJenisLaundry()== id){
                foundIndex = i; /** menyimpan nilai index dari data yg ditemukan */
            }
        }
        return foundIndex;
    }
}