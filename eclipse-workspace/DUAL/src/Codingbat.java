
public class Codingbat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

//We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
//
//
//monkeyTrouble(true, true) true
//monkeyTrouble(false, false) true
//monkeyTrouble(true, false) false

	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		return aSmile == bSmile ? true : false;

	}

//Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//
//
//sumDouble(1, 2) - 3
//sumDouble(3, 2) - 5
//sumDouble(2, 2) - 8

	public int sumDouble(int a, int b) {
		return a != b ? a + b : 2 * (a + b);
	}

//Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//diff21(19) - 2
//diff21(10) - 11
//diff21(21) - 0

	public int diff21(int n) {
		return n > 21 ? 2 * (n - 21) : 21 - n;
	}

//	We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//
//	parrotTrouble(true, 6) - true
//	parrotTrouble(true, 7) - false
//	parrotTrouble(false, 6) - false

	public boolean parrotTrouble(boolean talking, int hour) {
		return talking && hour < 7 || talking && hour > 20 ? true : false;
	}

//Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
//
//
//makes10(9, 10) - true
//makes10(9, 9) - false
//makes10(1, 9) - true

	public boolean makes10(int a, int b) {
		return (a == 10 || b == 10 || a + b == 10);
	}

//Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//
//
//nearHundred(93) - true
//nearHundred(90) - true
//nearHundred(89) - false
	public boolean nearHundredmio(int n) {
		return (n <= 110 && n >= 90 || n <= 210 && n >= 190);
	}

//Otra forma de hacerlo, con Maths.abs MIRARLO
	public boolean nearHundred(int n) {

		return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));

	}

//Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
//
//
//posNeg(1, -1, false) - true
//posNeg(-1, 1, false) - true
//posNeg(-4, -5, true) - true

	public boolean posNeg(int a, int b, boolean negative) {
		return ((a < 0 && b < 0) && negative) || ((a > 0 && b < 0) && !negative) || ((a < 0 && b > 0) && !negative);
	}

	public boolean posNeg2(int a, int b, boolean negative) {
		return ((a < 0 && b < 0) && negative) || ((a > 0 && b < 0) && !negative) || ((a < 0 && b > 0) && !negative)
				? true
				: false;
	}

	public boolean posNegsolucion(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		} else {
			return ((a < 0 && b > 0) || (a > 0 && b < 0));
		}
	}

//Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
//
//
//notString("candy") - "not candy"
//notString("x") - "not x"
//notString("not bad") - "not bad"

	public String notString(String str) {
		return (str.length() >= 3 && str.substring(0, 3).equals("not")) ? str : "not " + str;
	}

	public String notStringsolucion(String str) {
		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
			return str;
		}

		return "not " + str;
	}

//Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
//
//
//missingChar("kitten", 1) -"ktten"
//missingChar("kitten", 0) - "itten"
//missingChar("kitten", 4) - "kittn"

	public String missingChar(String str, int n) {
		String principio = str.substring(0, n);
		String fin = str.substring(n + 1, str.length());
		return principio + fin;
	}

//Given a string, return a new string where the first and last chars have been exchanged.
//
//
//frontBack("code") - "eodc"
//frontBack("a") - "a"
//frontBack("ab") - "ba"

	public String frontBack(String str) {
		if (str.length() <= 1)
			return str;
		char a = str.charAt(0);
		char b = str.charAt(str.length() - 1);
		String medio = str.substring(1, str.length() - 1);
		return b + medio + a;
	}

	public String frontBacksolucion(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);

		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

//Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
//
//
//front3("Java") - "JavJavJav"
//front3("Chocolate") - "ChoChoCho"
//front3("abc") - "abcabcabc"

	public String front3(String str) {
		if (str.length() <= 3) {
			return str + str + str;
		} else {
			String front = str.substring(0, 3);
			return front + front + front;
		}
	}

//		Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//				backAround("cat") - "tcatt"
//				backAround("Hello")- "oHelloo"
//				backAround("a") - "aaa"

	public String backAround(String str) {
		char a = str.charAt(str.length() - 1);
		return a + str + a;
	}

//Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
//
//or35(3) - true
//or35(10) - true
//or35(8) - false

	public boolean or35(int n) {	
		
		
		return n >= 0 && (n % 3 == 0 || n % 5 == 0);
	}

}
