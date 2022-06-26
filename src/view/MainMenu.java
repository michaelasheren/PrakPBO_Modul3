/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.*;
import javax.swing.JOptionPane;
import controller.Controller;

/**
 *
 * @author Sheren
 */
public class MainMenu {

    public MainMenu() {
        showMainMenu();
    }

    DataStatusUser funct1 = new DataStatusUser();
    NilaiAkhirMahasiswa funct2 = new NilaiAkhirMahasiswa();
    RataAkhirMahasiswaAll funct3 = new RataAkhirMahasiswaAll();
    MatkulAmbilMahasiswa funct4 = new MatkulAmbilMahasiswa();
    JumlahMahasiswaTidakLulus funct5 = new JumlahMahasiswaTidakLulus();
    JamKerjaDosen funct6 = new JamKerjaDosen();
    HitungGaji funct7 = new HitungGaji();

    public void showMainMenu() {
        String name;
        int nik = 0;
        int nim = 0;
        String kodemk;
        Boolean next = true;
        while (next) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Input menu : \n1. Print Data dan Status User \n2. Nilai Akhir Mahasiswa Tertentu"
                    + "\n3. Rata-rata Seluruh Nilai Akhir \n4. Mata Kuliah yang Diambil Mahasiswa \n5. Jumlah Mahasiswa Tidak Lulus \n6. Jam Kerja Dosen \n7. Hitung Gaji Dosen dan Karyawan \n8. Keluar"));
            switch (menu) {
                case 1:
                    name = JOptionPane.showInputDialog(null, "Masukkan nama");
                    funct1.DataStatusUser(name);
                    break;
                case 2:
                    int menuNilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Input jenis user : \n1. Sarjana \n2. Magister \n3. Doktor"));
                    switch (menuNilai) {
                        case 1:
                            nim = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIM"));
                            kodemk = JOptionPane.showInputDialog(null, "Masukkan Kode MK");
                            funct2.NilaiAkhirSarjana(nim, kodemk);
                            break;
                        case 2:
                            nim = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIM"));
                            kodemk = JOptionPane.showInputDialog(null, "Masukkan Kode MK");
                            funct2.NilaiAkhirMagister(nim, kodemk);
                            break;
                        case 3:
                            nim = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIM"));
                            funct2.NilaiAkhirDoktor(nim);
                            break;
                    }
                    break;
                case 3:
                    kodemk = JOptionPane.showInputDialog(null, "Masukkan Kode MK");
                    funct3.RataAkhirMahasiswaAll(kodemk);
                    break;
                case 4:
                    nim = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIM"));
                    funct4.MatkulAmbilMahasiswa(nim);
                    break;
                case 5:
                    kodemk = JOptionPane.showInputDialog(null, "Masukkan Kode MK");
                    funct5.JumlahMahasiswaTidakLulus(kodemk);
                    break;
                case 6:
                    nik = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIK"));
                    funct6.JamKerjaDosen(nik);
                    break;
                case 7:
                    nik = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan NIK"));
                    funct7.HitungGaji(nik);
                    break;
                case 8:
                    next = false;
                    break;
            }
        }
    }
}
