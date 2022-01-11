import java.util.Objects;

public class IntegerPalindrome {


    //ZAMIANA INTEGERA NA STRING i nastepnie na stringBuildera
    public static boolean isPalindromeToString(int number) {

        String numStr = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(numStr);
        String stringReversed = stringBuilder.reverse().toString();

        if (stringReversed.equals(numStr)){
            return true;
        }else {
            return false;
        }
    }

    //SPRAWDZENIE ZA POMOCA STRING BUFFER'A
    public static boolean isPalindromeStringBuffer(int number){
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        stringBuffer.reverse();
        if (number == Integer.parseInt(String.valueOf(stringBuffer))){
            return true;
        }else {
            return false;
        }
    }


    //ODWROCENIE INTA I SPRAWDZENIE CZY JEST PALINDROMEM
    public static boolean isPalindormeInt(int number){
        int rev =0;
        int helpNum = number;
        while (number != 0){
            rev = rev*10 + number%10;
            number=number/10;

        }
        if (rev == helpNum){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeToString(1121));
        System.out.println(isPalindormeInt(1121211));
        System.out.println(isPalindromeStringBuffer(1121));
    }



}
