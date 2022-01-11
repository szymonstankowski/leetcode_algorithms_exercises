import java.util.Arrays;
import java.util.Locale;


public class RemoveDuplicatesFromSortedArray {



    public static int removeDuplicates(int[] nums){
        //SORTOWANIE TABLICY
        Arrays.sort(nums);
        //LATWY SPOSOB
        int[] ints = Arrays.stream(nums).distinct().toArray();

        int index = 1;
        //ITERUJEMY PO TABLICY I SPRAWDZAMY CZY ELEMENENT NUMS[I] JEST ROZNY OD NUMS[I+1]
        //JESLI TAK TO ZAPISUJEMY POD TABLICA NUMS I INDEXEM WARTOSC Z POZYCJI NUMS[I+1]
        //ZWRACAMY DLUGOSC TABLICY POPRZEZ ZWROCENIE WARTOSCI INDEX
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                nums[index++]=nums[i+1];
            }

        }
        System.out.println(Arrays.toString(nums));

        return index;
    }

    public static void main(String[] args) {

        int[]nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println("new arr length: "+removeDuplicates(nums));
    }
}
