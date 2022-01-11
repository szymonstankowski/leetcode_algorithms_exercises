public class ReverseAString {

    //NAJLATWIEJSZY
    public static String reverseWithStringBuilder(String str) {

        return new StringBuilder(str)
                .reverse()
                .toString();
    }

    //LATWY
    public static String reverseManually(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();

    }

    //ZASOBORZERNY
    public static String reverseManually2(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(reverseWithStringBuilder("Szymon"));
        System.out.println(reverseManually("Szymon"));
        System.out.println(reverseManually2("Szymon"));
    }
}
