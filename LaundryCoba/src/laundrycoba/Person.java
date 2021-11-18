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
public class Person {
    protected String nama, alamat, telepon;
    //menggunakan protected agar dapat diakses oleh class turunannya
    
    public Person (String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
}
