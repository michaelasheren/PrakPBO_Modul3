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
public class NilaiAkhirMahasiswa {

    Controller init = new Controller();
    double na;

    public void NilaiAkhirSarjana(int nim, String kodemk) {
        for (int i = 0; i < init.getListSarjana().size(); i++) {
            if (nim == init.getListSarjana().get(i).getNIM()) {
                for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                    if (kodemk.equals(init.getListSarjana().get(i).getListMatkulAmbil().get(j).getKode())) {
                        na = (init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN1() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN2() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                        JOptionPane.showMessageDialog(null, na);
                        return;
                    }
                }
            }
        }
    }

    public void NilaiAkhirMagister(int nim, String kodemk) {
        for (int i = 0; i < init.getListMagister().size(); i++) {
            if (nim == init.getListMagister().get(i).getNIM()) {
                for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                    if (kodemk.equals(init.getListMagister().get(i).getListMatkulAmbil().get(j).getKode())) {
                        na = (init.getListMagister().get(i).getListMatkulAmbil().get(j).getN1() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN2() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                        JOptionPane.showMessageDialog(null, "Nilai akhir : " + na);
                        return;
                    }
                }
            }
        }
    }

    public void NilaiAkhirDoktor(int nim) {
        for (int i = 0; i < init.getListDoktor().size(); i++) {
            if (nim == init.getListDoktor().get(i).getNIM()) {
                na = ((init.getListDoktor().get(i).getNilai1() + init.getListDoktor().get(i).getNilai2() + init.getListDoktor().get(i).getNilai3()) / 3);
                JOptionPane.showMessageDialog(null, "Nilai akhir : " + na);
            }
        }
    }
}
