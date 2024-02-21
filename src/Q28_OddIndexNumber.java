import java.util.Scanner;

public class Q28_OddIndexNumber {
    // Task-> girilen str'deki indexi tek olan karakterleri print eden code create ediniz.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin = sc.nextLine();

        for (int i = 1; i < metin.length(); i=i+2) {
            System.out.print(metin.charAt(i));
        }
        //2.yol
        System.out.println();
        for (int i = 1; i < metin.length(); i++){
            if (i%2!=0){
                System.out.print(metin.charAt(i));
            }
        }

    }
}