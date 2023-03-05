/*
	MOperasiTitik.java  01/03/2023
	Nama      : Mahardika Putra Wardhana
	NIM       : 24060121130076
	Deskripsi : Main
*/

public class MOperasiTitik {
    public static void main(String[] args){
        Titik t1 = new Titik(5.0,3.0);
        OperasiTitik op = new OperasiTitik();
            
        System.out.println("TItik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
            
        op.refleksiX(t1);
        System.out.println("\n TItik setelah refleksi sumbu x");
        System.out.println("TItik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
            
        op.refleksiY(t1);
        System.out.println("\n TItik setelah refleksi sumbu y");
        System.out.println("TItik(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
            
            
        
    }
}
