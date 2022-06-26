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
public class HitungGaji {

    Controller init = new Controller();
    int unit = 0;
    int gaji;

    public void HitungGaji(int nik) {
        for (int i = 0; i < init.getListKaryawan().size(); i++) {
            if (nik == init.getListKaryawan().get(i).getNIK()) {
                unit = init.getListKaryawan().get(i).getListPresensiStaff().get(i).getStatus();
                if (unit == model.Status.HADIR) {
                    unit++;
                }
                System.out.println(unit);
                gaji = (unit / 22) * init.getListKaryawan().get(i).getSalary();
                JOptionPane.showMessageDialog(null, "Gaji : " + gaji);
                return;
            }
        }
        for (int i = 0; i < init.getListDosenTetap().size(); i++) {
            if (nik == init.getListDosenTetap().get(i).getNIK()) {
                unit = init.getListDosenTetap().get(i).getListPresensiStaff().get(i).getStatus();
                if (unit == model.Status.HADIR) {
                    unit++;
                }
                System.out.println(unit);
                gaji = init.getListDosenTetap().get(i).getSalary() + (unit * 25000);
                JOptionPane.showMessageDialog(null, "Gaji : " + gaji);
                return;
            }
        }
        for (int i = 0; i < init.getListDosenHonorer().size(); i++) {
            if (nik == init.getListDosenHonorer().get(i).getNIK()) {
                unit = init.getListDosenHonorer().get(i).getListPresensiStaff().get(i).getStatus();
                if (unit == model.Status.HADIR) {
                    unit++;
                }
                System.out.println(unit);
                gaji = (unit) * init.getListDosenHonorer().get(i).getHonor();
                JOptionPane.showMessageDialog(null, "Gaji : " + gaji);
                return;
            }
        }
    }
}
