import java.util.HashMap;

public class IntegerToRoman {

    public static String intToRoman(int num){

        String[] units =
                {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String[] tens =
                {"","X","XX","XXX","XL","LX","L","LXX","LXXX","XC"};
        String[] hundreds =
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] thousands =
                {"","M","MM","MMM"};

        return thousands[num/1000]+
                hundreds[(num%1000)/100]+
                tens[(num%100)/10]+
                units[num%10];
    }

    public static void main(String[] args) {
        System.out.println("Data urodzenia Agaty "+ intToRoman(28)+"-"+intToRoman(11)+"-"+intToRoman(2016));
        System.out.println("Data urodzenia Stefana "+ intToRoman(27)+"-"+intToRoman(12)+"-"+intToRoman(2020));
        System.out.println("Data urodzenia Szymona "+ intToRoman(10)+"-"+intToRoman(1)+"-"+intToRoman(1987));
        System.out.println("Data urodzenia Moniki "+ intToRoman(19)+"-"+intToRoman(1)+"-"+intToRoman(1990));
    }
}
