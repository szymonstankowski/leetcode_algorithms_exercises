public class LongestPalindromeSubstring {
    static int resultStart;
    static int resultLength;

    public static String longestPalindrome(String str){
      int strLength = str.length();

      if (strLength < 2){
        return str;
      }

        for (int start = 0; start <strLength -1; start++) {
            expandRange(str, start, start);
            expandRange(str, start, start-1);
        }
        return str.substring(resultStart, resultStart +resultLength);
    }

    public static void expandRange(String str, int begin, int end){
        while (begin>0 && end<str.length() &&
        str.charAt(begin)==str.charAt(end)) {
            begin--;
            end++;
        }
        if (resultLength < end - begin -1){
            resultStart = begin + 1;
            resultLength = end - begin - 1 ;
        }

    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aabbaabbaaddaad")+
                " - length: "+longestPalindrome("aabbaabbaaddaad").length());
    }
}
