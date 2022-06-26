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
public class MatkulAmbil {

    String kode;
    int sks;
    String nama;
    int n1, n2, n3;

    public MatkulAmbil(String kode, int sks, String nama, int n1, int n2, int n3) {
        this.kode = kode;
        this.sks = sks;
        this.nama = nama;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<MatkulAmbil>();

    ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();

    public MatkulAmbil() {

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

    public ArrayList<MatkulAmbil> getListMatkulDiajar() {
        return listMatkulAmbil;
    }

    public void setListMatkulDiajar(ArrayList<MatkulAmbil> listMatkulDiajar) {
        this.listMatkulAmbil = listMatkulDiajar;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "MatkulAmbil{" + "kode=" + kode + ", sks=" + sks + ", nama=" + nama + ", listMatkulDiajar=" + listMatkulAmbil + ", listPresensi=" + listPresensi + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + '}';
    }

}
