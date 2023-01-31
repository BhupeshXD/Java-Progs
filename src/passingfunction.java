import java.util.Arrays;

public class passingfunction {
    public static void main(String[] args) {
        int[] nums = {2,4,6,1,7,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
    }


}
