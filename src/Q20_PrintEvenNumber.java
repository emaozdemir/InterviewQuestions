import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("bir sayı girin: ");
        int sayi = scan.nextInt();
        System.out.println("tekCiftKontrol(sayi) = " + tekCiftKontrol(sayi));
        // tekCiftKontrol1();
        tekCiftKontrol2();


    }//main sonu

    private static void tekCiftKontrol2() {
        System.out.println("bir sayı girin: ");
        int sayi1 = scan.nextInt();
        if (sayi1 % 2 == 0) {
            System.out.println("ciftir");
        } else {
            System.out.println("tektir");
        }

    }

    private static boolean tekCiftKontrol2(int sayi) {
        return sayi % 2 == 0 ? true : false;

    }

    private static String tekCiftKontrol(int num) {
        if (num % 2 == 0) {
            return "çift";
        } else {
            return "tek";
        }


    }

}//Class sonu
