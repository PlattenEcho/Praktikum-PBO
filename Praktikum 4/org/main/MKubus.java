/*
	MKubus.java  15/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file class untuk MKubus
*/


package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujurSangkar = new BujurSangkar(5);
        Kubus kubus = new Kubus(bujurSangkar);

        System.out.println("Luas Alas Kubus = " + kubus.luasAlas());
        System.out.println("Volume Kubus = " + kubus.hitungVolume());
    }
}
