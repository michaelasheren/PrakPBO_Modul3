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
public class Presensi {

    String tanggal;
    int status;

    public Presensi(String tanggal, int status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
    }
    ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();

    public Presensi() {

    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    @Override
    public String toString() {
        return "Presensi{" + "tanggal=" + tanggal + ", status=" + status + ", listPresensi=" + listPresensi + '}';
    }

}
