/*
	BujurSangkar.java  28/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file class implementasi bujur sangkar
*/

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();

        System.out.print("Masukkan sisi bujur sangkar :");
        double sisi = scan.nextDouble();
        
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
    }
}
