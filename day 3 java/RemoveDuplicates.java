
import java.util.Arrays;
public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // Initialize with the first element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] inputArray = {22, 22, 77, 77, 88, 89, 89};

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        int uniqueCount = removeDuplicates(inputArray);

        System.out.println("After removing duplicates: " + Arrays.toString(Arrays.copyOfRange(inputArray, 0, uniqueCount)));
        System.out.println("Number of unique elements: " + uniqueCount);
    }
}

