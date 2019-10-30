/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118911.latihan42.tabungan;

/**
 *
 * @author Dandi M Iqbal
 * Nama : Dandi Muhammad Iqbal 
 * Kelas : IF-11K
 * Nim : 10118911
 * Deskripsi Program : Program ini berisi program untuk menghitung penarikan
 * uang dari saldo awal
 */
public class Tabungan {    
    private final int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah) {
        return saldo - jumlah;
    }
}
