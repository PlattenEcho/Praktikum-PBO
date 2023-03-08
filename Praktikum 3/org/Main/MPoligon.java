/*
	Mpoligon.java  08/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : Main
*/

package org.Main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
        System.out.println(" "); //linebreak
        Segitiga segitiga = new Segitiga(3,4,3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
    }
}
