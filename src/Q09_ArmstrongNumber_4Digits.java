import java.util.Scanner;

public class Q09_ArmstrongNumber_4Digits {
   /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748
         soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız*/


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        String sayi= scan.next();
        System.out.println("Task01****");
        System.out.println("armstrongControl(sayi) = " + armstrongControl(sayi));
        System.out.println("***Task02***");
        girilenSayiyaKadarArmstrongControl(sayi);


    }//main sonu

    private static void girilenSayiyaKadarArmstrongControl(String sayi) {
        for (int i = 1; i <=Integer.parseInt(sayi); i++) {
            System.out.println(armstrongControl(String.valueOf(i)));
        }
    }

    private static String armstrongControl(String sayi) {
        int rakamKupToplam=0;
        String[] rakam=sayi.split("");
        for (String each:rakam){
            rakamKupToplam+= (int) Math.pow(Integer.parseInt(each),rakam.length);
        }
        return rakamKupToplam==Integer.parseInt(sayi)?
                "Girilen "+sayi+" sayisi ARMSTRONG sayidir":
                "Girilen "+sayi+" sayisi ARMSTRONG sayi degildir";
    }
}















