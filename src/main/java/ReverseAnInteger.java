public class ReverseAnInteger {

    //EASY WAY
    public static int reverse(int num){
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    public static int reverse2(int num){

        int reversed = 0;
        while (num!=0){
            reversed= reversed*10+num%10;
            num/=10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
                return 0;
            }
        }
        return reversed;

    }

    public static void main(String[] args) {
        System.out.println(reverse2(123456));
        System.out.println(reverse(123456));
    }
}
