import java.util.Arrays;

public class Hairetu3 {

	public static void main(String[] args) {
		int[] nums = { 8, 5, 9, 2, 4 };
		Arrays.sort(nums);

		//Arrays.fill(nums, 10);

		for (int n : nums) {
			System.out.println(n);

		}
		int sum = 0;
		for (int gou : nums) {
			sum += gou;
		}
		System.out.println(sum);

		int count = 0;
		for (int c : nums) {
			if (c <= 5) {
				count++;
			}
		}
		System.out.println(count);

		for (int i = 0 ; i<nums.length ; i++){
			nums[i] *= 2;
		}

		int max = 0;
		for (int m : nums) {
			max = Math.max(max, m);
		}
		System.out.println(max);
	}
}
