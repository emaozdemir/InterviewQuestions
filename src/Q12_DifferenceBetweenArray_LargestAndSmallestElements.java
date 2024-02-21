import java.util.Arrays;
import java.util.Scanner;

public class Q12_DifferenceBetweenArray_LargestAndSmallestElements {
    /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");
        int boyut = input.nextInt();
        int[] arr = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println(i + 1 + ".elemani giriniz");
            arr[i] = input.nextInt();
        }
//        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
//        Arrays.sort(arr);
//        System.out.println("En buyuk ve en kucuk eleman farki : "+(arr[arr.length-1]-arr[0]));

        //2.yol
        int max = arr[0];
        int min = Integer.MAX_VALUE;
        for (int w : arr) {
            if (max < w) {
                max = w;
            }
            if (min > w) {
                min = w;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("fark = " + (max-min));

        //3.yol
        int max1 = arr[0];
        int min1 = Integer.MAX_VALUE;
        for (int w : arr) {
            //max1 = Math.max(max1, w);
            max1 = Integer.max(max1, w);
            //min1 = Math.min(min1, w);
            min1 = Integer.min(min1, w);
        }
        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);
        System.out.println("fark = " + (max1-min1));

    }
}