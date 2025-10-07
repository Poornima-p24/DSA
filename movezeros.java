import java.util.*;  

public class movezeros {
   
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        // Collect non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                list.add(nums[i]);
            }
        }

        // Place them back in array
        int k = list.size();
        for (int i = 0; i < k; i++) {
            nums[i] = list.get(i);
        }

        // Fill remaining with zeros
        for (int i = k; i < n; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        movezeros obj = new movezeros(); // create object
        int[] nums = {0, 0, 9, 7, 9};
        obj.moveZeroes(nums); // call the method

        // print result
        System.out.println(Arrays.toString(nums));
    }
}
