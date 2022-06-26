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
public class MatkulAjar {

    String kode;
    int sks;
    String nama;

    public MatkulAjar(String kode, int sks, String nama) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
    }
    ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList<MatkulAjar>();

    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public MatkulAjar() {

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

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public void setListMatkulDiajar(ArrayList<MatkulAjar> listMatkulDiajar) {
        this.listMatkulDiajar = listMatkulDiajar;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "MatkulAjar{" + "kode=" + kode + ", sks=" + sks + ", nama=" + nama + ", listMatkulDiajar=" + listMatkulDiajar + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

}
