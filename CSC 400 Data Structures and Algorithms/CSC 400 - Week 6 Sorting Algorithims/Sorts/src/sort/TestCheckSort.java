package sort;

public class TestCheckSort {
	// main
	public static void main(String[] args) {
		CheckIfSorted check = new CheckIfSorted();
		Bubble bubble = new Bubble();
		ShellSort shell = new ShellSort();
		System.out.println("Is the array sorted, True or False?");
        int[] arr = { 43, 61, 78, 55, 45, 78, 91 };
        int[] arr1 = { 3, 25, 33, 34, 45, 45, 87, 88 };
		int[] arr2 = { 1, 7, 9, 10, 12, 17, 20, 55, 67 };
		int[] arr3 = { 7, 55, 1, 17, 20, 55, 4, 8 };
		int[] arr4 = { 5 };
		System.out.print("Array 1 is: ");
		check.printTOrF(arr);
		System.out.print("Array 1 using bubble sort is: ");
		bubble.bubble(arr);
		check.printTOrF(arr);
		System.out.print("Array 2 is: ");
		check.printTOrF(arr1);
		System.out.print("Array 3 is: ");
		check.printTOrF(arr2);
		System.out.print("Array 4 is: ");
		check.printTOrF(arr3);
		System.out.print("Array 4 using shell sort is: ");
		shell.sort(arr3);
		check.printTOrF(arr3);
		System.out.print("Array 5 is: ");
		check.printTOrF(arr4);
    }
}