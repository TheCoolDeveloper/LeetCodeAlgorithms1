public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        //first calculate the actual displacement
        int arrLength = nums.length;
        int actualK = k % arrLength;

        if (arrLength == 0 || actualK == 0) return;

        //variable to track number of replacements
        int counter = 0;

        //variable to temporary hold value that is getting replaced

        for (int start = 0; counter < arrLength; start++) {
            int current = start;
            int tempVal = nums[current];

            //initializing next to -9 to satisfy initial while condition
            int next = -9;
            while (next != start) {
                int currentVal;
                next = (current + actualK) % arrLength;
                currentVal = nums[next];
                nums[next] = tempVal;
                tempVal = currentVal;
                current = next;
                counter++;
            }
        }

    }


    public static void main(String[] args) {
        RotateArray189 rotater = new RotateArray189();
        int[] arrInput = {1, 2, 3, 4, 5, 6};
        rotater.rotate(arrInput, 4);
        System.out.println(arrInput);
    }
}
