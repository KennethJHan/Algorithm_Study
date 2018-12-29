import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class MaxValueFinder2 {
	public static void main(String[] args) {
		ArrayList<Integer> number_list = new ArrayList<>(Arrays.asList(2,3,5,4,1));

		int max_num = Collections.max(number_list);
		int min_num = Collections.min(number_list);

		System.out.println("Max Number: "+max_num);
		System.out.println("min Number: "+min_num);
	}
}
