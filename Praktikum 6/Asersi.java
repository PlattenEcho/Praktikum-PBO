/*
	Asersi.java  2/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : file asersi
*/

public class Asersi {
    public static void main(String[] args){
        int x=0;
        if(x>0){
            System.out.println("x bilangan positif");
        }else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
