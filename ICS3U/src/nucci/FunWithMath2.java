package nucci;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMath2 {

	public static DecimalFormat df = new DecimalFormat("0.0##");
	/**
	 * entry method that gains values from user
	 * @param args String[] 
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("Please enter two numbers:");
		double userInput1 = read.nextInt();
		double userInput2 = read.nextInt();
		
		System.out.println(multiply(userInput1, userInput2));
		System.out.println(divide(userInput1, userInput2));
		System.out.println(add(userInput1, userInput2));
		System.out.println(subtract(userInput1, userInput2));
	}
	
	/**
	 * multiplies two numbers
	 * @param num1 double first number to multiply
	 * @param num2 double second number to multiply
	 * 
	 * @return The string to print
	 */
	public static String multiply(double num1, double num2){
		return "A * B = " + df.format(num1 * num2);
	} 
	
	/**
	 * divides two numbers
	 * @param num1 double first number to divide
	 * @param num2 double second number to divide
	 * 
	 * @return The string to print
	 */
	public static String divide(double num1, double num2){
		return "A / B = " + df.format(num1 / num2);
	} 
	
	/**
	 * adds two numbers
	 * @param num1 double first number to add
	 * @param num2 double second number to add
	 * 
	 * @return The string to print
	 */
	public static String add(double num1, double num2){
		return "A + B = " + df.format(num1 + num2);
	} 
	
	/**
	 * subtracts two numbers
	 * @param num1 double first number to subtract
	 * @param num2 double second number to subtract
	 * 
	 * @return The string to print
	 */
	public static String subtract(double num1, double num2){
		return "A - B = " + df.format(num1 - num2);
	} 

}
