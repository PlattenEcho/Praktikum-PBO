/*
	MTitik.java  23/02/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : kelas untuk MTitik
*/
public class MTitik{
	public static void main(String[] args){
		
		Titik a = new Titik();
		a.setAbsis(5);
		a.setOrdinat(6);
		
		Titik b = new Titik(1,2);

		Titik t3 = new Titik(5,6);

		System.out.println("a("+a.absis+", "+a.ordinat+")");
		System.out.println("b("+b.absis+", "+b.ordinat+")");
		System.out.println("t3("+t3.absis+", "+t3.ordinat+")");
		System.out.println("counter = "+b.getCounterTitik());
	}
}
