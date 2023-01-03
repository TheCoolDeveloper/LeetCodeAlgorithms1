public class RotateArray189 {
    public void rotate(int[] nums, int k) {

        //first calculate the actual displacement
        int arrLength = nums.length;
        int actualK = k % arrLength;

        //this variable will hold the variable getting replaced
        int tempVal;

//        this variable will keep track of
        int startIndex = 0;
        int oldIndex = 0;
        int currentVal = nums[oldIndex];
        for (int counter = 0; counter < nums.length; counter++) {
            if(oldIndex == startIndex){
                oldIndex = (oldIndex+1)% arrLength;
                startIndex = oldIndex;
                currentVal = nums[oldIndex];
            }
            int newIndex = (oldIndex + actualK) % arrLength;
            if(oldIndex == startIndex){
                oldIndex = (oldIndex+1)% arrLength;
                startIndex = oldIndex;
                newIndex = (oldIndex + actualK) % arrLength;
                currentVal = nums[oldIndex];
            }
            tempVal = nums[newIndex];
            nums[newIndex] = currentVal;
            oldIndex = newIndex;
            currentVal = tempVal;
        }
    }

    public static void main(String[] args) {
        RotateArray189 rotater = new RotateArray189();
        int[] arrInput = {-1,-100,3,99};
        rotater.rotate(arrInput, 2);
        System.out.println(arrInput);


    }
}
