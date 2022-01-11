import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int [] nums = {11,10,1,15};

        int target = 26;

        System.out.println(Arrays.toString(sumOfTwo(nums, target)));;

    }

    public static int[] sumOfTwo(int[] arr, int target){
        int indexArr[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==target){
                    indexArr[0]=i;
                    indexArr[1]=j;
                    return indexArr;
                }
            }
        }
        return null;
    }
}
