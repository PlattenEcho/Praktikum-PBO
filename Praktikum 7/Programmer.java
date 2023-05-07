/*
	Programmer.java  07/05/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file subclass untuk pegawai
*/

public class Programmer extends Pegawai {
    protected int tunjangan = 450000;

    public Programmer(String nama){
        setNama(nama);
    }

    public void tampilData(){
        System.out.println("Nama: " + this.nama + ", Gaji: " + this.gajiPokok + ", Tunjangan: " + this.tunjangan);
    }
}
