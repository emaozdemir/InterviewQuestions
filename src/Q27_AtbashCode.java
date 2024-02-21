import java.util.Scanner;

public class Q27_AtbashCode {
    /*  Task->
      AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
      Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
      "abcdefghijklmnopqrstuvwxyz"; 26 harf
      "zyxwvutsrqponmlkjihgfedcba";

      Girilen bir str'nin AtbashCode print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz: ");
        String metin=sc.nextLine().toLowerCase().replace(" ","");

        String alfabe="abcdefghijklmnopqrstuvwxyz";
        String atbash="zyxwvutsrqponmlkjihgfedcba";

        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < alfabe.length(); j++) {
                if (metin.charAt(i)==alfabe.charAt(j)){
                    System.out.print(atbash.charAt(j));
                    break;
                }
            }
        }

        System.out.println();
        String newStr="";
        for (int i = 0; i <metin.length(); i++) {
            newStr+=atbash.charAt(alfabe.indexOf(metin.charAt(i)));
        }
        System.out.println(newStr);




    }
}