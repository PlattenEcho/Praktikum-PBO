package Collections;
/*
    File    :   MapTest.java
    Deskripsi: Program yang menggunakan Generic untuk pasangan
                Kunci-Nilai
    Nama    : Mahardika Putra Wardhana
    NIM     : 24060121130076
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"satu");
        map.put(2,"dua");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();   


        System.out.println("");
        //jawab:
        //iterasi untuk mengambil keseluruhan nilai dari kunci
        System.out.println("Iterasi untuk mengambil keseluruhan nilai dari kunci:");
        for(Integer i : key){
            System.out.print(i+" ");
        }
        System.out.println("");
        for(Integer i : key){
            System.out.print(map.get(i)+" ");
        }
    }
}
