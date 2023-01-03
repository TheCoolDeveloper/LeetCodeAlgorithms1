public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low<high){
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;
            if (target < nums[mid]) high = mid -1;
            else low = mid + 1;
        }
        return low;
    }
    public static void main(String[] args) {
        SearchInsertPosition35 sip = new SearchInsertPosition35();
        System.out.println(sip.searchInsert(new int[]{1,3,5,6}, -1));
    }
}
