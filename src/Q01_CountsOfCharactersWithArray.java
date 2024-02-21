import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
        Task-> Girilen bir String value için  herbir character'in sayisini print eden code create ediniz.
        Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
               abaa   ==> a=3  b=1
       */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String str = sc.nextLine();

        String[] arr = str.split(""); // her bir karakteri ayırır
        System.out.println(Arrays.toString(arr));

        String output = "";
        // Karakterlerin sayısını belirlemek için bir döngü kullanılır
        for (int i = 0; i < arr.length; i++) {
            int counter = 0; // Her karakterin sayısını saklamak için sayaç sıfırlanır
            // Her karakter için diziyi tarar ve kaç defa tekrarlandığını sayar
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    counter++;
                }
            }
            // Karakteri ve sayısını output stringine ekler
            if (!output.contains(arr[i])) {
                output += arr[i] + " = " + counter + ", ";
            }
        }
        // Sonucu yazdırır
        System.out.println("Sonuç: " + output);

        //2.yol
      /*  int count = 0;
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(j)))) {
                    count++;
                }
            }
            if (!output.contains(String.valueOf(str.charAt(i)))) {
                output += "" + String.valueOf(str.charAt(i)) + count + " ";
            }
        }
        System.out.println("1.yol: " + output);


       */
    }
}