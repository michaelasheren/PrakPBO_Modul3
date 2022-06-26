/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.Status;

/**
 *
 * @author Sheren
 */
public class MatkulAmbilMahasiswa {

    Controller init = new Controller();
    int presensi = 0;

    public void MatkulAmbilMahasiswa(int nim) {
        for (int i = 0; i < init.getListSarjana().size(); i++) {
            if (nim == init.getListSarjana().get(i).getNIM()) {
                JOptionPane.showMessageDialog(null, init.getListMatkulAmbil());
                presensi = init.getListMatkulAmbil().get(i).getListPresensi().get(i).getStatus();
                if (presensi == model.Status.HADIR) {
                    presensi++;
                }
                JOptionPane.showMessageDialog(null, "Jumlah presensi : " + presensi);
            }
        }
        for (int i = 0; i < init.getListMagister().size(); i++) {
            if (nim == init.getListMagister().get(i).getNIM()) {
                JOptionPane.showMessageDialog(null, init.getListMatkulAmbil());
                presensi = init.getListMatkulAmbil().get(i).getListPresensi().get(i).getStatus();
                if (presensi == model.Status.HADIR) {
                    presensi++;
                }
                JOptionPane.showMessageDialog(null, "Jumlah presensi : " + presensi);
            }
        }
    }
}
