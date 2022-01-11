import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInteger(String romanNum){

        String str = "IVXLCDM";
        int[] arr = {1,5,10,50,100,500,1000};
        int ans =0;
        for(int i=0;i<romanNum.length();i++){
            if(i!=romanNum.length()-1 && arr[str.indexOf(romanNum.charAt(i))]<arr[str.indexOf(romanNum.charAt(i+1))]){
                ans -= arr[str.indexOf(romanNum.charAt(i))];
            }
            else{
                ans += arr[str.indexOf(romanNum.charAt(i))];
            }
        }
        return ans;

    }


    //ROZWIAZANIE PRZY UZYCIU MAPY
    public static int romanToIntegerMap(String str){

        //LICZBY RZYMSKIE "V", "X" POPRZEDZONE "I" SA POMNIEJSZANE O 1 CZYLI
        // IV = 4; IX = 9; XC = 90; CD = 400; CM =900
        Map<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);



        int result = 0;
        //ITERUJEMY W PETLI O DLUGOSCI PRZEKAZANEGO STRINGA
//        for (int i = 0; i < str.length(); i++) {
//            //JESLI i>0 i WARTOSC POD KLUCZEM TAKIM JAK CHAR ZE STRINGA NA INDEXIE i
//            //JEST WIEKSZA OD WARTOSCI CHAR ZE STRINGA SPOD INDEXU i-1
//            System.out.println(map.get(str.charAt(i)));
//            if(i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
//                //TO ZAPISZ DO ZMIENNEJ RESULT
//                //WARTOSC SPOD KLUCZA str.charAt(i) MINUS 2X WAROSC SPOD map.get(str.charAt(i-1)
//
//                result+= map.get(str.charAt(i)) -2 * map.get(str.charAt(i-1));
//            }else {
//                result += map.get(str.charAt(i));
//            }
//        }


        for (int i = 0; i < str.length(); i++) {
            if (i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
                result+=map.get(str.charAt(i)) -2 * map.get(str.charAt(i-1));
            }else {
                result+=map.get(str.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
     //   System.out.println(romanToInteger("MCMXCIV"));
        System.out.println(romanToIntegerMap("MCCCLIV"));
    }
}
