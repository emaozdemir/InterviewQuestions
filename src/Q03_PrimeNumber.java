import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bir sayi giriniz");
        int sayi = scan.nextInt();
        boolean asalMi = true;
        if (sayi >= 2) {//girilen sayini 2 den buyklugu kontrol edildi
            for (int i = 2; i < sayi; i++) {//2'den girilen syidan bir kucuk olan sayiya kadar dongu akisa alindi
                if (sayi % i == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                System.out.println("Girilen " + sayi + " sayisi asal sayidir");
            } else System.out.println("Girilen " + sayi + " sayisi asal sayi degildir");
        } else System.out.println("Girilen sayi asla degildir");

    }
}















