package practice;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayClassPractice {

	public static void main(String[] args) {
		int[] sorted_num = {1,2,3,5,7,8,9};
		int index = Arrays.binarySearch(sorted_num, 3);
		System.out.println(index);
		Integer[] num = {12,3,5,98,56,456,78,88};
		Arrays.sort(num);
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.sort(num,Comparator.reverseOrder());
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
		Arrays.fill(num, 1);
		for(int x:num) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
