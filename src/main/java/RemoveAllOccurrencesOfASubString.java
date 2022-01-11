public class RemoveAllOccurrencesOfASubString {

    public static String removeOccurrences(String s, String part){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            // ZA KAZDYM RAZEM KIEDY DLUGOSC SB JEST >= DLUGOSCI PART SPRAWDZ CZY SUBSTRING SB ZACZYNAJACY SIE
            // OD DLUGOSC SB - DLUGOSC PART == PART
            // JESLI TAK TO USTAW DLUGOSC SB NA WARTOSC DLUGOSC SB - DLUGOSC PART
            if (sb.length() >= part.length()){

                if (sb.substring(sb.length()-part.length()).equals(part)){
                    sb.setLength(sb.length() - part.length());
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("abcaaaaabcbcaabcbbbbbabc", "abc"));
    }

}
