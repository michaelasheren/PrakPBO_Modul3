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
public abstract class Dosen extends Staff {

    String departemen;

    public Dosen(String departemen) {
        this.departemen = departemen;
    }

    ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList<MatkulAjar>();
    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public Dosen() {

    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
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
        return "Dosen{" + "departemen=" + departemen + ", listMatkulDiajar=" + listMatkulDiajar + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

}
