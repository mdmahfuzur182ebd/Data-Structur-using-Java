package Maximum_Sum_SubArray;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int s = 0;
        int start = 0; int end =0;
        for (int i = 0; i <nums.length ; i++) {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = s; end = i;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
                s = i+ 1;
            }
        }
        System.out.println(max_so_far);
    }
}
