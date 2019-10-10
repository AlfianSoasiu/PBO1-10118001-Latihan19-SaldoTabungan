/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi : Memnbuat program saldo tabungan
 */
public class saldotabungan {
    
    public static void main(String[] args) {
        int saldo = 2500000;
        double bunga = 0.15;
        int saldosekarang = (int) (saldo + (saldo * bunga));
        int lama = 6;
        for (int i = 1; i <= lama; i++, saldosekarang += (saldosekarang * bunga)){
            System.out.printf("Saldo di bulan ke-"+ (i) + " Rp.%,10d%n", saldosekarang);
        }
        
    }
}