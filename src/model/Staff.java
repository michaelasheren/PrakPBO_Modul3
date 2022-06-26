/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sheren
 */
public class Staff extends User {

    int NIK;

    public Staff(int NIK) {
        this.NIK = NIK;
    }

    public Staff() {

    }

    public int getNIK() {
        return NIK;
    }

    public void setNIK(int NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        return super.toString() + "Staff{" + "NIK=" + NIK + '}';
    }

}
