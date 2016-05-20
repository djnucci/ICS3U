package nucci;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FunWithMath {

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
		
		multiply(userInput1, userInput2);
		divide(userInput1, userInput2);
		add(userInput1, userInput2);
		subtract(userInput1, userInput2);
	}
	
	/**
	 * multiplies two numbers
	 * @param num1 double first number to multiply
	 * @param num2 double second number to multiply
	 */
	public static void multiply(double num1, double num2){
		System.out.println("A * B = "+ df.format(num1 * num2));
	} 
	
	/**
	 * divides two numbers
	 * @param num1 double first number to divide
	 * @param num2 double second number to divide
	 */
	public static void divide(double num1, double num2){
		System.out.println("A / B = "+ df.format(num1 / num2));
	} 
	
	/**
	 * adds two numbers
	 * @param num1 double first number to add
	 * @param num2 double second number to add
	 */
	public static void add(double num1, double num2){
		System.out.println("A + B = "+ df.format(num1 + num2));
	} 
	
	/**
	 * subtracts two numbers
	 * @param num1 double first number to subtract
	 * @param num2 double second number to subtract
	 */
	public static void subtract(double num1, double num2){
		System.out.println("A - B = "+ df.format(num1 - num2));
	} 

}
