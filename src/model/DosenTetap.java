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
public class DosenTetap extends Dosen {

    int salary;

    public DosenTetap(int salary) {
        this.salary = salary;
    }

    public DosenTetap() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "DosenTetap{" + "salary=" + salary + '}';
    }

}
