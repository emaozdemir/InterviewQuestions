import java.util.Scanner;

public class Q07_IsDigit {
    /* Task->
   Create a method that accepts a String as parameter and finds the sum of digits in that String.
   girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
   Example:
   input : J4\/4 1$ 34$¥
   output : 16

   Hint:
   Character.isDigit()
   Integer.valueOf()
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = input.nextLine();
        System.out.println("sumOfDigit(metin) = " + sumOfDigit(metin));


    }//main sonu

    private static int sumOfDigit(String metin) {
        int toplam = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (Character.isDigit(metin.charAt(i))) {
                //toplam+=Integer.parseInt(metin.substring(i,i+1));
                //toplam+=Integer.valueOf(String.valueOf(metin.charAt(i)));
                //toplam += Character.getNumericValue(metin.charAt(i));
                toplam +=Integer.valueOf(""+metin.charAt(i));
            }
        }
        return toplam;
    }
}//Class sonu