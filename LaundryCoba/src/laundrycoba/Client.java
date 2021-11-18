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
public class Client extends Person {
    private int idClient;
    private double saldo;
    
   public Client(int idClient, String nama, String alamat, String telepon, double saldo) {
        super(nama, alamat, telepon); 
        // pemanggilan constructor yang terdapat dalam class utama Person 
        this.idClient = idClient; 
        // pemanggilan idClient menggunakan super karena berada pada class itu sendiri yaitu Client
        this.saldo = saldo; 
        // begitu juga dengan saldo karena terdapat pada class itu sendiri
    }
    
   //enkapsulasi untuk memanggil data idClient 
   public int getIdClient (){
       // memanggil data
    return idClient; // mengembalikan nilai
    }
   
   //enkapsulasi untuk memanggil data idClient
   public String getNama (){
    return nama;
    }
   
   //enkapsulasi untuk memanggil data idClient
   public String getAlamat (){
    return alamat;
    }
   
   //enkapsulasi untuk memanggil data idClient
   public String getTelepon (){
    return telepon;
    }
   
   //enkapsulasi untuk memanggil data idClient
   public double getSaldo() {
        return saldo;
    }
   
   //method untuk menguragi saldo dari client 
    public void kurangiSaldo(double jumlah){
        this.saldo -= jumlah;
    }
}
