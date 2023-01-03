public class SquaresofaSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        int squarePtr = ptr2;
        while (ptr2 != ptr1) {
            int sq1 = nums[ptr1] * nums[ptr1];
            int sq2 = nums[ptr2] * nums[ptr2];
            if (sq1 > sq2) {
                squares[squarePtr--] = sq1;
                ptr1++;
            }else if (sq1 < sq2){
                squares[squarePtr--] = sq2;
                ptr2--;
            }else{
                squares[squarePtr--] = sq1;
                ptr1++;
                squares[squarePtr--] = sq2;
                ptr2--;
            }
        }
        return squares;
    }

    public static void main(String[] args) {
        SquaresofaSortedArray977 sq = new SquaresofaSortedArray977();
        int[] result = sq.sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(result);
    }
}
