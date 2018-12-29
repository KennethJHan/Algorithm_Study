import java.util.Arrays;
import java.util.ArrayList;

class MaxValueFinder {
	public static void main(String[] args) {
		ArrayList<Integer> number_list = new ArrayList<>(Arrays.asList(2,3,5,4,1));

		int max_num = number_list.get(0);
		int min_num = number_list.get(0);

		for(int num: number_list) {
			// Find Max Number
			if(max_num < num) {
				max_num = num;
			}

			// Find Min Number
			if(min_num > num) {
				min_num = num;
			}
		}

		System.out.println("Max Number: "+max_num);
		System.out.println("min Number: "+min_num);
	}
}
