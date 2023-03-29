/*
	Asersi2.java  2/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file asersi2
*/

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari != 0): "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+kelilingLingkaran);
    }
}

/*
 secara konsep, ada yang kurang tepat pada program Asersi2 di atas?

 Jawaban:
 kesalahan pada program Asersi2 ada pada parameter di assert, yaitu assert(jariJari > 0). assert(jariJari > 0) akan mengeluarkan
 "jari-jari tidak boleh nol!!!" apabila bilangan > 0, 
 kondisi assert tersebut tetap akan mengeluarkan kalimat tersebut meskipun bilangan tidak nol yaitu bilangan negatif.
 Oleh karena itu parameter assert seharusnya assert(jariJari != 0) yang berarti akan mengeluarkan  "jari-jari tidak boleh nol!!!" hanya pada
 selain kondisi jariJari != 0.
 */