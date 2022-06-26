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
public class MatkulPilihan extends Matkul {

    int min;

    public MatkulPilihan(int min) {
        this.min = min;
    }
    ArrayList<MatkulPilihan> listMatkulPil = new ArrayList<MatkulPilihan>();

    public MatkulPilihan() {

    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public ArrayList<MatkulPilihan> getListMatkulPil() {
        return listMatkulPil;
    }

    public void setListMatkulPil(ArrayList<MatkulPilihan> listMatkulPil) {
        this.listMatkulPil = listMatkulPil;
    }

    @Override
    public String toString() {
        return "MatkulPilihan{" + "min=" + min + ", listMatkulPil=" + listMatkulPil + '}';
    }

}
