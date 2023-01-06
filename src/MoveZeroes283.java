public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        if (nums.length < 1) return;
//        zptr that swoops through the loop
//        NonZptr tracks moving of non zero elements to beginning
        int nonZPtr = 0;
        for (int zPtr = 0; zPtr < nums.length; zPtr++) {
            if (nums[zPtr] != 0 && zPtr!=nonZPtr) {
                //if zPtr is pointing to nonZero element and is at different spot than nonZptr,
                // then move it no location nonZPtr
                int temp = nums[zPtr];
                nums[zPtr] = 0;
                nums[nonZPtr++] = temp;
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes283 mover = new MoveZeroes283();
        mover.moveZeroes(new int[]{1,1,0,3,12});
    }
}
