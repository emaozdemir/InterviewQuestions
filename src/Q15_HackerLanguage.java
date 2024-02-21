import java.util.Arrays;
import java.util.Scanner;

public class Q15_HackerLanguage {

// Task->Girilen bir metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) create ediniz.
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin=input.nextLine();
        hackerDili(metin);
        System.out.println();
        hackerDili1(metin);


    }//main sonu

    private static void hackerDili1(String metin) {
        System.out.println(metin.replace("s","5")
                .replace("a","4")
                .replace("e","3")
                .replace("i","1")
                .replace("o","0")
        );
    }

    private static void hackerDili(String metin) {
        String[] arr=metin.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("s")) arr[i]="5";
            if (arr[i].equals("a")) arr[i]="4";
            if (arr[i].equals("e")) arr[i]="3";
            if (arr[i].equals("i")) arr[i]="1";
            if (arr[i].equals("o")) arr[i]="0";
            System.out.print(arr[i]);
        }
    }
}// Class sonu