package utils;

public class SplitArray {
	
	public static void split(int length, String array, int arr[]) {
		String[] string = array.split(" ");
	    for(int i = 0; i<length; i++) arr[i] = Integer.valueOf(string[i]);
	}
}
