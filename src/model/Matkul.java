/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sheren
 */
public class Matkul {

    String kode;
    int sks;
    String nama;

    public Matkul(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }
    ArrayList<Matkul> listMatkul = new ArrayList<Matkul>();

    public Matkul() {

    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Matkul> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(ArrayList<Matkul> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString() {
        return "Matkul{" + "kode=" + kode + ", sks=" + sks + ", nama=" + nama + ", listMatkul=" + listMatkul + '}';
    }

}
