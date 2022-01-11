public class LengthOfLastWord {

    // stworzenie tablicy ze stringa z jego zawartoscia przy uzyciu metody split
    // pobranie ostetniego elementu tablicy ze slowem i sprawdzenie i zwrocenie jego dlugosci przy uzyciu parsowania
    public static int length (String str){
        String [] strTab = str.split(" ");

        String word = strTab[strTab.length-1];
        return Integer.parseInt(String.valueOf(word.length()));

    }

    public static void main(String[] args) {

        System.out.println(length("   fly me   to   the moon  "));
        System.out.println(length("luffy is still joyboy"));
        System.out.println(length("Hello World"));

    }

}
