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
public class DataStatusUser {

    Controller init = new Controller();

    public void DataStatusUser(String name) {
        for (int i = 0; i < init.getListSarjana().size(); i++) {
            if (name.equals(init.getListSarjana().get(i).getNama())) {
                String print = init.getListSarjana().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
        for (int i = 0; i < init.getListMagister().size(); i++) {
            if (name.equals(init.getListMagister().get(i).getNama())) {
                String print = init.getListMagister().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
        for (int i = 0; i < init.getListDoktor().size(); i++) {
            if (name.equals(init.getListDoktor().get(i).getNama())) {
                String print = init.getListDoktor().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
        for (int i = 0; i < init.getListDosenTetap().size(); i++) {
            if (name.equals(init.getListDosenTetap().get(i).getNama())) {
                String print = init.getListDosenTetap().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
        for (int i = 0; i < init.getListDosenHonorer().size(); i++) {
            if (name.equals(init.getListDosenHonorer().get(i).getNama())) {
                String print = init.getListDosenHonorer().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
        for (int i = 0; i < init.getListKaryawan().size(); i++) {
            if (name.equals(init.getListKaryawan().get(i).getNama())) {
                String print = init.getListKaryawan().get(i).toString();
                JOptionPane.showMessageDialog(null, print);
                return;
            }
        }
    }
}
