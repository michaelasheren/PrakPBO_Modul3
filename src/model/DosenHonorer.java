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
public class DosenHonorer extends Dosen {

    int honor;//honor per sks

    public DosenHonorer(int honor) {
        this.honor = honor;
    }

    public DosenHonorer() {

    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public String toString() {
        return super.toString() + "DosenHonorer{" + "honor=" + honor + '}';
    }

}
