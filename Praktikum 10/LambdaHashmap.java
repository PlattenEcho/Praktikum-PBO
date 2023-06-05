import java.util.*;

/*
    File    :   MapTest.java
    Deskripsi: Program yang menggunakan Generic untuk pasangan
                Kunci-Nilai
    Nama    : Mahardika Putra Wardhana
    NIM     : 24060121130076
*/

public class LambdaHashmap {
    public static void main(String[] args){
        Map<Long, String> map = new HashMap<Long, String>();  
        map.put(24060121130076L, "Mahardika Putra Wardhana");
        map.put(22010321130023L, "Roseanne Gabriella");


        //Implementasi Ekspresi Lambda
        map.forEach((i, j) -> {
            System.out.print(i + " " + map.get(i));
            System.out.println(" ");}
            );
    }
}
