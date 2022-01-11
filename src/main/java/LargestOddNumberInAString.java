public class LargestOddNumberInAString {

    // iterowanie od tyli po przekazanym stringu
    // parsowanie kazdego elementu stringa i sprawdzanie czy jest on liczba nieparzysta
    // jesli jest nieparzysty  zwracanie substringa o poczatku 0 i koncu i+1
    // jesli nie jest zwrocenie pustego stringa

    public static String findLargestOddNum(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(findLargestOddNum("123456"));;
    }
    }




