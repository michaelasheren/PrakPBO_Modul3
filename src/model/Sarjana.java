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
public class Sarjana extends Mahasiswa {

    ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<MatkulAmbil>();
    ArrayList<MatkulPilihan> listMatkulPil = new ArrayList<MatkulPilihan>();

    public Sarjana() {

    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public void setListMatkulAmbil(ArrayList<MatkulAmbil> listMatkulAmbil) {
        this.listMatkulAmbil = listMatkulAmbil;
    }

    public ArrayList<MatkulPilihan> getListMatkulPil() {
        return listMatkulPil;
    }

    public void setListMatkulPil(ArrayList<MatkulPilihan> listMatkulPil) {
        this.listMatkulPil = listMatkulPil;
    }

    @Override
    public String toString() {
        return super.toString() + "Sarjana{" + "listMatkulAmbil=" + listMatkulAmbil + ", listMatkulPil=" + listMatkulPil + '}';
    }

}
