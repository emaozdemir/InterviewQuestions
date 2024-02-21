import java.util.ArrayList;
import java.util.Arrays;

public class Q14_CreateRandomList_SetList {
    //Task->
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.


    public static void main(String[] args) {
        int[] arr = new int[10];
        randomEkle(arr);


    }//main sonu

    private static void randomEkle(int[] arr) {
        int ciftSayiAdedi = 0;
        for (int i = 0; i < arr.length; i++) {
            int rastgele = (int) (Math.random() * 20);
            if (rastgele % 2 == 0) {
                arr[i] = 111;
                ciftSayiAdedi++;

            } else {
                arr[i] = rastgele;
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        if (ciftSayiAdedi == 0) {
            System.out.println("Cift sayı yoktur");
        }
        System.out.println("Cift sayı adedi = " + ciftSayiAdedi);


    }


}//Class sonu