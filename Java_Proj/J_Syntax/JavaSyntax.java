
//import java.util.Scanner;
//import java.io.File;

public class JavaSyntax {

	public static void main(String[] args) {

		// //=========================================== Comment

		/*
		 * Multi Line Comment
		 */

		// var num1 = 34; //short and long;
		// byte zeroOrone = 0;
		// int forInt = 3;
		// float forFloat = 23.45f; // f suffix (a must); d for double;
		// char forChar = 'S'; // single quotes.; Can also pass ASCII values ( A = 68 );
		// String name = "Double Quote.";
		// boolean bool = 23 > 12;

		// System.out.printf("%d %c %10s %b %d %.2f", zeroOrone, forChar, name, bool,
		// forInt, forFloat);

		// // for strings : %-9s [ 9 spaces, left align keep the org case as { s }  small ];
		// // %4.5d { 4 spaces 5 deci point };

		// // ===============================================  Type Casting

        // int x = 23 ;
		// double deciNum = 23.89000;
		// float f = 23.78f;
		// String tr = "this is my line";
		// String numStr = "3456";

		// String newInt = String.valueOf(x);
		// System.out.println(x);

		// float newFloat = (float) x/f;
		// int num4 = (int) newFloat;
		// double deciNum2 = (double) newFloat;

		// // ===========================================  AutoBoxing ?????

		// Integer num34 = 23;
		
		// System.out.println(num34.getClass().getName());

		// String newDou = Double.toString(deciNum);
		// System.out.println(newDou);

		//  //============================ unBoxing 

		// int num35 = num34;
		// System.out.println(num35);

		// int num36 = Integer.valueOf(num34);
		// System.out.println(num36);
		

		// // ============================================== String methods

		// String nameAndSirName;

		// Scanner scannerObj = new Scanner(System.in);

		// System.out.printf("Enter Your Name and Sir Name:");
		// nameAndSirName = scannerObj.nextLine();

		// int Index = nameAndSirName.indexOf("a");
		// scannerObj.close();

		// System.out.println(name.indxOf("Q"));
		// System.out.println(name.substring(0, 6));
		// System.out.println(name.contains("e")); // can also create a loop and check
		// ascii code value

		// //===================================== Muiliple varable Declaration

		// int sam, ban, han;
		// sam = ban = han = 23;
		// final int num2 = 23; // constant immutable

		// ======================================== Math expressions in Java

		// System.out.println( 2*7/3); // 4 ( / 1st then * ); B O D M A S,
		// System.out.println( 2 - 3 + 5); // 4
		// System.out.println( Math.pow(3,3) *2 /3); // 9.0 float beaccuase of math
		// power
		// System.out.println(Math.PI);
		// System.out.println(Math.pow(3,2)); // 18.0 ans float
		// System.out.println(2-3*4/6 + Math.pow(5,2)*10); // 120.o
		// System.out.println(9*2/2); // 9 }=> Div 1st
		// System.out.println(6^3); // Binary XOR convert num to binary then | 1 | 1 | = 0 | comparison Again to deci

		// // ====================================== Arrays 1D 2D

		// //int[] array = new int[5];
		// int[][] array2D = new int[3][4];

		// Scanner scanObj = new Scanner(System.in);

		// int i, j;
		// i = j = 0;
		// while (j < array2D.length){
		// for(i = 0; i < array2D[j].length; ++i){
		// System.out.printf("Enter num%d:\t", i);
		// array2D[j][i] = scanObj.nextInt();
		// }
		// ++j;
		// }

		// // finding the index

		// for (int[] y: array2D){
		// for(i = 0; i < y.length; ++i){
		// if(25 == y[i]){
		// System.out.printf("The index of 25 is = %d", i);
		// }
		// }

		// }

		// //fix this
		// i = 1;
		// //for(int x = 0; x < array2D[i].length; x++){ // length() is for strings;
		// for (int[] y : array2D) { // x has a array;
		// j = 0;
		// while (j < y.length) {
		// System.out.printf("Enter the elements of the array:%\td", y[j]);
		// y[j] = scanObj.nextInt(); //error, java referenced this for print;
		// i++;
		// j++;
		// }
		// scanObj.close();
		// }
		// //}

		// // =================================== Strings =========================

		// System.out.println("\nAs Salamu alaykum, Fam");
		// System.out.println("App"+"le");
		// System.out.println(num1 +" "+ num2);
		// System.out.printf("%6d %3d", forFloat,num2);

		// // ==================================== Taking user input

		// //The scanner obj is to be created once, for all user inputs;
		// Scanner scanObj = new Scanner(System.in);

		// //The following line can repeat multiple times;

		// System.out.print("Enter a integer:");
		// int num3 = scanObj.nextInt();
		// scanObj.close();

		// // ===================================== Loops =========================

		// int i2 = 1;
		// while( i2 < 23){ // Runs on a condition no itterator needed.
		// System.out.printf("The iterator i = %d \t", i2);
		// i++;
		// }

		// int j;
		// for(j = 1; j > 13; j++){ // controles looping num of iterations known
		// System.out.print(" \\j/ \t");
		// }

		// Who gets incremented 1st;
		// int i, j = 0;
		// for( i = 0; i < 11; j +=i, i++){

		// System.out.println(j);
		// System.out.println(i+"\n");
		// }

		// Which one comes 1st;
		// float jam = 5;
		// int sam = 10;
		// jam /= sam;
		// System.out.printf("%f", jam); // 0 so jam / sam;

		// int k = 1;
		// do{ // Runs once always no matter the condition;
		// System.out.printf("This will run even though k = %d & num3 = %d. And the
		// condition is k > num3", k, num3);
		// k++;
		// } while(k <= num3);

		// //for each loop:
		// //formatted print
		// //array = {1,2,3,4,2};
		// int x = 0;
		// while(x < array.length){
		// array[x] = scanObj.nextInt();
		// x++;
		// }

		// for(int x2 : array){
		// System.out.printf("%d \t", x2); // %d for int, %f for deci, %c, %s,
		// Date&time:%t %tH %tS;
		// }

		// ============== How Increment works

		// //Guess the output;
		// int i = 1;
		// while(i < 5){
		// System.out.println(i);
		// i++;
		// System.out.println(i);
		// ++i;
		// System.out.println(i);
		// }

		// for(i = 1;i < 5; i++){ // This only increment when loop ends;
		// System.out.println(i);
		// i++;
		// System.out.println(i);
		// }

		// //============================ How to take input in single line comments

		// Scanner scanObj2 = new Scanner(System.in);

		// System.out.print("Enter a list of number's.");
		// int i3 = 0;
		// while(i3 < array.length){
		// array[i3] = scanObj2.nextInt();
		// i++;
		// }

		// //============================ Area of a triangle in line calcu;

		// int len = 23;
		// int high = 78;
		// int area;
		// System.out.printf("The area is: %1$6d", area = len*high);

		// //============================= String Formatting

		// System.out.println("Enter a string:");
		// String str1 = scanObj.nextLine();
		// String str2 = "The man ran up the hill.";

		// scanObj.close();

		// System.out.println(str2);
		// System.out.println("String str2's Length is:"+ str2.length());
		// System.out.println("String str1 in Upper Case:"+str1.toUpperCase());
		// System.out.println("String str1 in Lower Case:"+str1.toLowerCase());
		// System.out.println("Index of 1st \"up the\" is:"+ str2.indexOf("up the"));
		// //lastIndexOf();

		// // =========================   Concatination 

		// System.out.println(str1+" "+str2);
		// System.out.println(str1.concat(str2));

		// short numExam = 2;
		// System.out.println(str1 + numExam); // Ans is not an erro, as str and num can
		// get concatinated;
		// System.out.println("This is carrage return \\r removed the text before it.
		// for e.g:");
		// System.out.println("This is carrage return \r removed the text before it. and
		// then we have (+++ ppp\b +++) back space there were suppose to be 3 (P's)");

		// //Escape Sequence; print special char to strings;
		// // \t, \n = \r, \", \b backspace (it deletes), \* Hexcode ...;

		// //split() [Returns a array], trim() whitespace remove, replace(t,p)...,
		// indexOf()... ;

		// //======================================== Spliting strings

		// String str3 = "The man ran up the hill.";
		// String[] strArry = str3.split( "\s+", 5); //regex: regular expresion, self
		// Explainatory.
		// //System.out.println("Splitted string (str2):"+splited);

		// for(String x3 : strArry){
		// System.out.println(x3);
		// }

		// // =============================== Method Overloading (method signature)

		// int a, b , c;
		// a = b = c = 23;
		// fun1(a,b);
		// fun1(a, b , c);

		// //============================= OOP

		// my_class classObj = new my_class();
		// classObj.myFunc(7865, "Sami");

		// // =================================== Array of Obj

	// 	my_class[] my_classObj1 = { (new my_class("Asad", 234)),
	// 			(new my_class("Saad", 564)),
	// 			(new my_class("Nehal", 722)) };

	// 	for (my_class x : my_classObj1) {

	// 		x.name += " Excpelled";

	// 		System.out.printf("\nStudent: %s \nEnrollment Number: %d\n\n", x.name, x.rollNum);
	// 	}

	// 	System.out.printf("Number of Obj Instences created are: %d", my_class.numOfInstences);
	// }

}

// ========================= Method overloading
// ========================= Methods signature (method name and parameters{order, number, sequence })

// static void fun1(int num, int sun){
// System.out.printf("This can be called in a static method %d ", num);

// }

// // Ststic is a keyword utility (useful) method and shared resources(var for
// all obj; same)

// static void fun1(int num, int sun, int c){
// System.out.printf("This can be called a static method %d", c);

// }

// ==================================== Obj Class

// class my_class {
// 	static int numOfInstences; // for the class; only one var created in java.
// 	int rollNum;
// 	String name;

// 	my_class(String stuName, int num) {
// 		this.rollNum = num;
// 		this.name = stuName;

// 		// System.out.printf("My name is: %s and my num is: %d", stuName, num);
// 		numOfInstences++; // post Increment inc after the line.

// 	}

}