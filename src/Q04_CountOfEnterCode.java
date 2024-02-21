import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //  Task-> STRING OLAN PIN kodunu 3 seferde  kontrol eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin = "javvacan";
        int girisHakki = 3;
        while (true) {
            System.out.println("lütfen pin giriniz: ");
            String kulPin = scan.next();
            if (kulPin.equals(pin)) {
                System.out.println("Pin gecerli HOSGELDINIZ");
                break;
            }else System.out.println("hatalı pin girdiniz");
            girisHakki--;
            System.out.println( "kalan giriş hakkın = " + girisHakki);
            if (girisHakki == 0) {
                System.out.println("Hakkin kalmadi telefoncuya git");
                break;
            }
        }



    }
}
