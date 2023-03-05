/*
	Titik.java  01/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : kelas untuk Titik
*/

public class Titik {
	//atribut
	private double absis;
	private double ordinat;
	static int counterTitik;
	
	// konstruktor	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	Titik(int x, int y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	//metode
	double getAbsis(){
		return absis;
	}
	double getOrdinat(){
		return ordinat;
	}
	
	double getCounterTitik(){
		return counterTitik;
	}
	
	void setAbsis(double a){
		absis = a;
	}
	void setOrdinat(double o){
		ordinat = o;
	}
}