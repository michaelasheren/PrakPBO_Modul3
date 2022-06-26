/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Set;
import model.User;
import model.Mahasiswa;
import model.Sarjana;
import model.Magister;
import model.Doktor;
import model.Staff;
import model.Dosen;
import model.DosenTetap;
import model.DosenHonorer;
import model.Karyawan;
import model.Status;
import model.Matkul;
import model.MatkulPilihan;
import model.MatkulAjar;
import model.MatkulAmbil;
import model.Presensi;
import model.PresensiStaff;

/**
 *
 * @author User
 */
public class Controller {

    ArrayList<Matkul> listMatkul = new ArrayList<>();
    ArrayList<MatkulAmbil> listMatkulAmbil = new ArrayList<>();
    ArrayList<MatkulAjar> listMatkulDiajar = new ArrayList<>();
    ArrayList<MatkulPilihan> listMatkulPil = new ArrayList<>();
    ArrayList<Presensi> listPresensi = new ArrayList<Presensi>();
    ArrayList<PresensiStaff> listPresensiStaff = new ArrayList<PresensiStaff>();

    ArrayList<Sarjana> listSarjana = new ArrayList<>();
    ArrayList<Magister> listMagister = new ArrayList<>();
    ArrayList<Doktor> listDoktor = new ArrayList<>();
    ArrayList<DosenTetap> listDosenTetap = new ArrayList<>();
    ArrayList<DosenHonorer> listDosenHonorer = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    public Controller() {
        Sarjana s1 = new Sarjana();
        s1.setNama("Sheren");
        s1.setAlamat("Jalan Mekar Indah");
        s1.setTtl("Yogyakarta, 01-08-2003");
        s1.setTelepon("123");
        s1.setNIM(1121007);
        s1.setJurusan("IF");
        MatkulAmbil matkul1 = new MatkulAmbil("IF-001", 3, "Algo", 100, 90, 90);
        Presensi presensi1 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi1);
        matkul1.setListPresensi(listPresensi);
        MatkulAmbil matkul2 = new MatkulAmbil("IF-002", 2, "WebDes", 80, 70, 90);
        Presensi presensi2 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi2);
        matkul2.setListPresensi(listPresensi);
        listMatkulAmbil.add(matkul1);
        s1.setListMatkulAmbil(listMatkulAmbil);
        MatkulPilihan matpil1 = new MatkulPilihan();
        matpil1.setKode("IF-001x");
        matpil1.setSks(2);
        matpil1.setNama("Probstat");
        matpil1.setMin(10);
        listMatkulPil.add(matpil1);
        s1.setListMatkulPil(listMatkulPil);
        listSarjana.add(s1);

        Sarjana s2 = new Sarjana();
        s2.setNama("Mark");
        s2.setAlamat("Jalan Astana Anyar");
        s2.setTtl("Jakarta, 02-08-2001");
        s2.setTelepon("321");
        s2.setNIM(1119010);
        s2.setJurusan("IF");
        MatkulAmbil matkul3 = new MatkulAmbil("IF-001", 3, "Algo", 40, 65, 30);
        Presensi presensi3 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi3);
        matkul3.setListPresensi(listPresensi);
        MatkulAmbil matkul4 = new MatkulAmbil("IF-002", 2, "WebDes", 100, 90, 90);
        Presensi presensi4 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi4);
        matkul4.setListPresensi(listPresensi);
        listMatkulAmbil.add(matkul3);
        listMatkulAmbil.add(matkul4);
        s2.setListMatkulAmbil(listMatkulAmbil);
        MatkulPilihan matpil2 = new MatkulPilihan();
        matpil2.setKode("IF-001x");
        matpil2.setSks(2);
        matpil2.setNama("Probstat");
        matpil2.setMin(10);
        listMatkulPil.add(matpil2);
        s2.setListMatkulPil(listMatkulPil);
        listSarjana.add(s2);

        Magister m1 = new Magister();
        m1.setNama("Reyhan");
        m1.setAlamat("Jalan Cibaduyut");
        m1.setTtl("Jakarta, 15-04-1999");
        m1.setTelepon("541");
        m1.setNIM(1118019);
        m1.setJurusan("IF");
        MatkulAmbil matkul5 = new MatkulAmbil("IF-011", 2, "Game", 100, 90, 90);
        Presensi presensi5 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi5);
        matkul5.setListPresensi(listPresensi);
        MatkulAmbil matkul6 = new MatkulAmbil("IF-012", 2, "Machine Learning", 70, 65, 90);
        Presensi presensi6 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi6);
        matkul6.setListPresensi(listPresensi);
        listMatkulAmbil.add(matkul5);
        listMatkulAmbil.add(matkul6);
        m1.setListMatkulAmbil(listMatkulAmbil);
        MatkulPilihan matpil3 = new MatkulPilihan();
        matpil3.setKode("IF-011x");
        matpil3.setSks(1);
        matpil3.setNama("Business");
        matpil3.setMin(10);
        listMatkulPil.add(matpil3);
        m1.setListMatkulPil(listMatkulPil);
        m1.setJudulTesis("Penerapan Machine Learning pada Game");
        listMagister.add(m1);

        Magister m2 = new Magister();
        m2.setNama("Clara");
        m2.setAlamat("Jalan Kopo");
        m2.setTtl("Bandung, 22-01-1999");
        m2.setTelepon("081");
        m2.setNIM(1118012);
        m2.setJurusan("IF");
        MatkulAmbil matkul7 = new MatkulAmbil("IF-011", 2, "AI", 80, 70, 95);
        Presensi presensi7 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi7);
        matkul7.setListPresensi(listPresensi);
        MatkulAmbil matkul8 = new MatkulAmbil("IF-012", 2, "Robot", 90, 85, 75);
        Presensi presensi8 = new Presensi("01/01/2022", 1, "10.00");
        listPresensi.add(presensi8);
        matkul8.setListPresensi(listPresensi);
        listMatkulAmbil.add(matkul7);
        listMatkulAmbil.add(matkul8);
        m2.setListMatkulAmbil(listMatkulAmbil);
        MatkulPilihan matpil4 = new MatkulPilihan();
        matpil4.setKode("IF-011x");
        matpil4.setSks(1);
        matpil4.setNama("Business");
        matpil4.setMin(10);
        listMatkulPil.add(matpil4);
        m2.setListMatkulPil(listMatkulPil);
        m2.setJudulTesis("Penerapan AI pada Robot untuk Keperluan Rumah Tangga");
        listMagister.add(m2);

        Doktor d1 = new Doktor();
        d1.setNama("Dewan");
        d1.setAlamat("Jalan Kopo");
        d1.setTtl("Bandung, 22-01-1995");
        d1.setTelepon("0813");
        d1.setNIM(1114001);
        d1.setJurusan("IF");
        d1.setNilai1(100);
        d1.setNilai2(90);
        d1.setNilai3(95);
        d1.setJudulDis("Perkembangan Machine Learning pada Tiktok");
        listDoktor.add(d1);

        Doktor d2 = new Doktor();
        d2.setNama("Ziva");
        d2.setAlamat("Jalan Cibadak");
        d2.setTtl("Bandung, 15-11-1995");
        d2.setTelepon("0812");
        d2.setNIM(1114007);
        d2.setJurusan("IF");
        d2.setNilai1(90);
        d2.setNilai2(80);
        d2.setNilai3(95);
        d2.setJudulDis("Perkembangan Machine Learning pada Instagram");
        listDoktor.add(d2);

        DosenTetap dt1 = new DosenTetap();
        dt1.setNIK(1);
        dt1.setNama("Andi");
        dt1.setAlamat("Jalan Kopo");
        dt1.setTtl("Bandung, 21-02-1979");
        dt1.setTelepon("0877");
        dt1.setDepartemen("IF");
        dt1.setSalary(150000);
        MatkulAjar matajar1 = new MatkulAjar("IF-001", 3, "Algo");
        MatkulAjar matajar2 = new MatkulAjar("IF-002", 2, "WebDes");
        listMatkulDiajar.add(matajar1);
        listMatkulDiajar.add(matajar2);
        dt1.setListMatkulDiajar(listMatkulDiajar);
        PresensiStaff presensis1 = new PresensiStaff("01/02/2022", 1, "08.00");
        PresensiStaff presensis2 = new PresensiStaff("02/02/2022", 0, "08.00");
        PresensiStaff presensis3 = new PresensiStaff("03/02/2022", 1, "08.00");
        listPresensiStaff.add(presensis1);
        listPresensiStaff.add(presensis2);
        listPresensiStaff.add(presensis3);
        dt1.setListPresensiStaff(listPresensiStaff);
        listDosenTetap.add(dt1);

        DosenHonorer dh1 = new DosenHonorer();
        dh1.setNIK(2);
        dh1.setNama("Budi");
        dh1.setAlamat("Jalan Holis");
        dh1.setTtl("Bandung, 09-08-1979");
        dh1.setTelepon("0813");
        dh1.setDepartemen("IF");
        dh1.setHonor(130000);
        MatkulAjar matajar3 = new MatkulAjar("IF-003", 1, "Prak Algo");
        MatkulAjar matajar4 = new MatkulAjar("IF-001x", 2, "Probstat");
        listMatkulDiajar.add(matajar3);
        listMatkulDiajar.add(matajar4);
        dh1.setListMatkulDiajar(listMatkulDiajar);
        PresensiStaff presensis4 = new PresensiStaff("01/02/2022", 1, "08.00");
        PresensiStaff presensis5 = new PresensiStaff("02/02/2022", 1, "08.00");
        PresensiStaff presensis6 = new PresensiStaff("03/02/2022", 1, "08.00");
        listPresensiStaff.add(presensis4);
        listPresensiStaff.add(presensis5);
        listPresensiStaff.add(presensis6);
        dh1.setListPresensiStaff(listPresensiStaff);
        listDosenHonorer.add(dh1);

        Karyawan k1 = new Karyawan();
        k1.setNIK(3);
        k1.setNama("Dewi");
        k1.setAlamat("Jalan Cibaduyut");
        k1.setTtl("Makassar, 09-11-1988");
        k1.setTelepon("0812");
        k1.setSalary(500000);
        PresensiStaff presensis7 = new PresensiStaff("01/02/2022", 0, "08.00");
        PresensiStaff presensis8 = new PresensiStaff("02/02/2022", 1, "08.00");
        PresensiStaff presensis9 = new PresensiStaff("03/02/2022", 1, "08.00");
        listPresensiStaff.add(presensis7);
        listPresensiStaff.add(presensis8);
        listPresensiStaff.add(presensis9);
        k1.setListPresensiStaff(listPresensiStaff);
        listKaryawan.add(k1);

//        System.out.println(s1.toString());
//        System.out.println(s2.toString());
//        System.out.println(m1.toString());
//        System.out.println(m2.toString());
//        System.out.println(d1.toString());
//        System.out.println(d2.toString());
//        System.out.println(dt1.toString());
//        System.out.println(dh1.toString());
//        System.out.println(k1.toString());
    }

    public static void main(String[] args) {
        new Controller();
    }

    public ArrayList<Matkul> getListMatkul() {
        return listMatkul;
    }

    public ArrayList<MatkulAmbil> getListMatkulAmbil() {
        return listMatkulAmbil;
    }

    public ArrayList<MatkulAjar> getListMatkulDiajar() {
        return listMatkulDiajar;
    }

    public ArrayList<MatkulPilihan> getListMatkulPil() {
        return listMatkulPil;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public ArrayList<Sarjana> getListSarjana() {
        return listSarjana;
    }

    public ArrayList<Magister> getListMagister() {
        return listMagister;
    }

    public ArrayList<Doktor> getListDoktor() {
        return listDoktor;
    }

    public ArrayList<DosenTetap> getListDosenTetap() {
        return listDosenTetap;
    }

    public ArrayList<DosenHonorer> getListDosenHonorer() {
        return listDosenHonorer;
    }

    public ArrayList<Karyawan> getListKaryawan() {
        return listKaryawan;
    }

}
