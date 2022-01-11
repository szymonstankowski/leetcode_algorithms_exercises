public class DetectCapital {

    public static boolean isWordValid(String str) {

        int numberOfCapitals = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                numberOfCapitals++;
            }
        }
        if (numberOfCapitals == str.length() || numberOfCapitals == 0) return true;
        return numberOfCapitals ==1 && Character.isUpperCase(str.charAt(0));
    }

    public static void main(String[] args) {
        System.out.println(isWordValid("usA"));
    }
}
