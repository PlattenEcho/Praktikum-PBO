/*
	BujurSangkar.java  28/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : 4file subclass untuk bujursangkar
*/

public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

/*
apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi 
metode abstrak yang ada pada kelas BangunDatar ? jelaskan ! 
Jawaban:
Akan terjadi compile error ketika program dirun, hal tersebut dikarenakan class BujurSangkar harus mengimplementasikan
method abstract yang ada pada abstract class BangunDatar yaitu method hitungLuas(double sisi)
 */