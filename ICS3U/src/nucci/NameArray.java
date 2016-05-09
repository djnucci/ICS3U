package nucci;

import java.util.Scanner;

public class NameArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int arrayLength = Integer.parseInt(scan.nextLine());
		
		String[] names = new String[arrayLength];
		String[] reverseNames = new String[arrayLength];
		
		for(int i = 0; i < arrayLength; i++){
			names[i] = scan.nextLine();
		}
		
		reverseNames = ReverseArray(names);
		
		for(int i = 0; i < arrayLength; i++){
			System.out.println(names[i]);
		}
		

	}
	
	public static String[] ReverseArray(String array[]){
		String[] reverseArray = new String[array.length];
		
		for(int i = 0; i < array.length; i++){
			reverseArray[Math.abs(i-array.length)] = array[i];
		}
		
		return reverseArray;
		
	}

}
