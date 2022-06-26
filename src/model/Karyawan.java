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
public class Karyawan extends Staff {

    int salary;

    public Karyawan(int salary) {
        this.salary = salary;
    }

    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    public Karyawan() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }

    @Override
    public String toString() {
        return super.toString() + "Karyawan{" + "salary=" + salary + ", listPresensiStaff=" + listPresensiStaff + '}';
    }

}
