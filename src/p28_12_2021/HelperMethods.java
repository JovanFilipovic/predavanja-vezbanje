package p28_12_2021;

public class HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1,2,3,4,1,2,3,31,4,5,67,7,8,346,34534,734734,854,2,324,623,6,2};
		
		printArray(array);
		printArrayReverse(array);
		
		
	}

	
	public static void printArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static void printArrayReverse(int[] array) {
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
		
	}
	
}
