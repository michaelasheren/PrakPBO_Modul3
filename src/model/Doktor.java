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
public class Doktor extends Mahasiswa {

    String judulDis;
    int nilai1;
    int nilai2;
    int nilai3;

    public Doktor(String judulDis, int nilai1, int nilai2, int nilai3) {
        this.judulDis = judulDis;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
    }

    public Doktor() {

    }

    public String getJudulDis() {
        return judulDis;
    }

    public void setJudulDis(String judulDis) {
        this.judulDis = judulDis;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    @Override
    public String toString() {
        return super.toString() + "Doktor{" + "judulDis=" + judulDis + ", nilai1=" + nilai1 + ", nilai2=" + nilai2 + ", nilai3=" + nilai3 + '}';
    }

}
