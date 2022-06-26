/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Status;
import javax.swing.JOptionPane;

/**
 *
 * @author Sheren
 */
public class JamKerjaDosen {

    Controller init = new Controller();
    int jam = 0;

    public void JamKerjaDosen(int nik) {
        for (int i = 0; i < init.getListDosenTetap().size(); i++) {
            if (nik == init.getListDosenTetap().get(i).getNIK()) {
                for (int j = 0; j < init.getListMatkulDiajar().size(); j++) {
                    jam = init.getListMatkulDiajar().get(i).getListPresensiStaff().get(i).getStatus();
                    if (jam == model.Status.HADIR) {
                        jam++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Total jam mengajar = " + jam);
        }
        for (int i = 0; i < init.getListDosenHonorer().size(); i++) {
            if (nik == init.getListDosenHonorer().get(i).getNIK()) {
                for (int j = 0; j < init.getListMatkulDiajar().size(); j++) {
                    jam = init.getListMatkulDiajar().get(i).getListPresensiStaff().get(i).getStatus();
                    if (jam == model.Status.HADIR) {
                        jam++;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Total jam mengajar = " + jam);
        }
    }
}
