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
public class PresensiStaff {

    String tanggal;
    int status;
    String jam;

    public PresensiStaff(String tanggal, int status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }
    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public PresensiStaff() {

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

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return "PresensiStaff{" + "tanggal=" + tanggal + ", status=" + status + ", jam=" + jam + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

}
