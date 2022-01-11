import java.util.Arrays;

public class TwoSum2 {

    public static int[] sumOfTwo(int[] arr, int target){
        int [] indexArr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    indexArr[0]=i+1;
                    indexArr[1]=j+1;
                    return indexArr;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums = {11,10,1,15};
        Arrays.sort(nums);
        int target = 26;
        System.out.println(Arrays.toString(sumOfTwo(nums, target)));
    }
}
