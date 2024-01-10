import java.util.Arrays;

public class Ground {
	
	Ground(){
		
	}
	
	static int[] insertionSort(int[] array) {	//static methods can be called by class name
		int[] result = new int[array.length];
		for (int endIndex = 0; endIndex < array.length; endIndex++) {
		// begin of insert
		int insertIndex = 0;
		while (insertIndex < endIndex && array[endIndex] > result[insertIndex]) {
		insertIndex ++;
		}
		for (int i = endIndex - 1; i >= insertIndex; i--) {
		result[i + 1] = result[i];
		}
		result[insertIndex] = array[endIndex];
		// end of insert
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 5, 9, 3, 2, 0 };
		System.out.println("Numbers before insertion sort: " + Arrays.toString(numbers));
		
		int[] result = Ground.insertionSort(numbers);
		
		System.out.println("Numbers after insertion sort: " + Arrays.toString(result));
	}

}
