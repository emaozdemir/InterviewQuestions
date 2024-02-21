public class Q01_ReverseString {
        /* Task->
	     Stringi tersten print için
		1.Yol: StringBuilder () kullanarak
		2.Yol: String Classini kullanarak
		3.Yol: Bir method create ediniz
    */

    public static void main(String[] args) {
        String str="All is well";
        //1.yol
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        //String reverseString=sb.reverse().toString();
        //System.out.println("1.yol reverseString : "+reverseString);
        System.out.println("1.yol reverseString : "+sb.reverse());

        //2.yol
        System.out.println("2.yol");
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
        //3.yol
        System.out.println("3.yol");
        reverseString(str);
    }

    private static void reverseString(String str) {
        char[] arr=str.toCharArray();
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}//class sonu