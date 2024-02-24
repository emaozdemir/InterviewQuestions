import java.util.Scanner;

public class Q39_UseContinue {

        /* Task->
         Girilen bir stringin harflerini bosluk veya a harfi hariç teker teker  alt alta print eden code create ediniz.
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir metin girin: ");
        String str=scan.nextLine();//javaCAN'a selam
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '||str.charAt(i)=='a'){//girilen str herbir tekrarin " " veya a olma sartı
                continue;//if true ise loop step action almadan sonraki stebe gecer
            }else System.out.println(str.charAt(i));

        }

    }
}
