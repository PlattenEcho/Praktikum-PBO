import java.util.Scanner;

/*
	BujurSangkar.java  28/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file class implementasi lingkaran
*/

public class MLingkaran{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan panjang jari-jari lingkaran : ");
        double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        System.out.println("Luas lingkaran dengan jejari "+ r + " satuan adalah "+l.hitungLuas());
    }
}