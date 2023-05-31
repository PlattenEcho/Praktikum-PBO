package Generics;
/*
    File    :   BangunDatarGeneric.java
    Deskripsi: kelas konstruksi generic untuk BangunDatar
    Nama    : Mahardika Putra Wardhana
    NIM     : 24060121130076
*/

public class BangunDatarGeneric<T extends BangunDatar>{
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

}

//: Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
// dengan karakter yang lain seperti, T1,T2,T1234. Simpulkan apa yang anda lakukan !
// Jawab:
// Penggantian 'T' menjadi karakter lain seperti T1,T2,T1234 dilakukan agar 
// penamaan atribut dapat lebih spesifik dan deskriptif. Selain itu penggantian nama tersebut 
// juga dapat membantu membedakan atribut.