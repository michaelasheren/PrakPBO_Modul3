/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Sheren
 */
public class RataAkhirMahasiswaAll {

    Controller init = new Controller();
    int total;
    double rata = 1;
    String namamk;

    public void RataAkhirMahasiswaAll(String kodemk) {
        for (int i = 0; i < init.getListSarjana().size(); i++) {
            for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                namamk = init.getListSarjana().get(i).getListMatkulAmbil().get(j).getNama();
                if (kodemk.equals(init.getListSarjana().get(i).getListMatkulAmbil().get(j).getKode())) {
                    total += (init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN1() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN2() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                }
            }
            rata = total / init.getListSarjana().size();
            JOptionPane.showMessageDialog(null, "Nilai rata-rata semua mahasiswa Sarjana untuk Mata Kuliah " + namamk + " adalah " + rata);
            return;
        }
        for (int i = 0; i < init.getListMagister().size(); i++) {
            for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                namamk = init.getListSarjana().get(i).getListMatkulAmbil().get(j).getNama();
                if (kodemk.equals(init.getListMagister().get(i).getListMatkulAmbil().get(j).getKode())) {
                    total += (init.getListMagister().get(i).getListMatkulAmbil().get(j).getN1() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN2() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                }
            }
            rata = total / init.getListMagister().size();
            JOptionPane.showMessageDialog(null, "Nilai rata-rata semua mahasiswa Sarjana untuk Mata Kuliah " + namamk + " adalah " + rata);
            return;
        }
    }
}
