public class Q26_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı)  print eden   METHOD create ediniz..

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */


    public static void main(String[] args) {
        String str = "ey edip adanada pide ye";
        frekans(str);


    }//main sonu

    private static void frekans(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int harfSayisi = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    harfSayisi++;
                }


            }
            // if (!output.contains(str.charAt(i)))
        }


    }

    //selim hocanın çözümü
    private static void frekans1(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            int harfsayisi = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    harfsayisi++;
                }
            }
            if (!output.contains(str.substring(i, i + 1))) {
                output += str.substring(i, i + 1) + harfsayisi;
            }
        }
        System.out.println("output = " + output);
    }
}//Class sonu
