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
public class JumlahMahasiswaTidakLulus {

    Controller init = new Controller();
    int count = 0;
    int na;
    String namamk;

    public void JumlahMahasiswaTidakLulus(String kodemk) {
        for (int i = 0; i < init.getListSarjana().size(); i++) {
            for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                if (kodemk.equals(init.getListSarjana().get(i).getListMatkulAmbil().get(j).getKode())) {
                    namamk = init.getListSarjana().get(i).getListMatkulAmbil().get(j).getNama();
                    na = (init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN1() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN2() + init.getListSarjana().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                    if (na < 56) {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "<" + count + "> dari <" + (init.getListSarjana().size()) + "> mahasiswa tidak lulus mata kuliah <" + namamk + ">");
        }
        for (int i = 0; i < init.getListMagister().size(); i++) {
            for (int j = 0; j < init.getListMatkulAmbil().size(); j++) {
                if (kodemk.equals(init.getListMagister().get(i).getListMatkulAmbil().get(j).getKode())) {
                    namamk = init.getListMagister().get(i).getListMatkulAmbil().get(j).getNama();
                    na = (init.getListMagister().get(i).getListMatkulAmbil().get(j).getN1() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN2() + init.getListMagister().get(i).getListMatkulAmbil().get(j).getN3()) / 3;
                    if (na < 56) {
                        count++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "<" + count + "> dari <" + (init.getListMagister().size()) + "> mahasiswa tidak lulus mata kuliah <" + namamk + ">");
        }
    }
}
