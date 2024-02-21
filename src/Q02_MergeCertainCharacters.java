import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=scan.nextLine();
        System.out.println("Ilk ve son harf kac defa tekrar etsin");
        int sayi= scan.nextInt();
        System.out.println("ilkVeSonHarfYazdir(metin,sayi) = " + ilkVeSonHarfYazdir(metin, sayi));

    }//main sonu

    private static String ilkVeSonHarfYazdir(String metin, int sayi) {
        String output="";
        for (int i = 0; i < sayi; i++) {
            output+=""+metin.charAt(0)+metin.charAt(metin.length()-1);
            //output+=metin.substring(0,1)+metin.substring(metin.length()-1);
        }
        return output;
    }
}//class sonu