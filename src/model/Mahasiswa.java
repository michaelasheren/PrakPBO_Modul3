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
public abstract class Mahasiswa extends User {

    int NIM;
    String jurusan;

    public Mahasiswa(int NIM, String jurusan) {
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    public Mahasiswa() {

    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return super.toString() + "Mahasiswa{" + "NIM=" + NIM + ", jurusan=" + jurusan + '}';
    }

}
