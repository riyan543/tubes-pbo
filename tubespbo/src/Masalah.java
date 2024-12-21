/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Masalah {
    private String jenisMasalah;
    private String deskripsi;
    private String solusi;

    // Constructor
    public Masalah(String jenisMasalah, String deskripsi, String solusi) {
        this.jenisMasalah = jenisMasalah;
        this.deskripsi = deskripsi;
        this.solusi = solusi;
    }

    public String getJenisMasalah() {
        return jenisMasalah;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getSolusi() {
        return solusi;
    }
    
}
