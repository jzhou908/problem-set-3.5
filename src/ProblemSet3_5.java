/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control structures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		//ps.primes(1, 1000);
		//ps.fibonacci(23);
		ps.palindromicNumbers(23432);
		//ps.multiples(2, 3, 40);
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	public boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int a = 2; a < n; a++){
			if(n % a == 0) {
				return false;
			}
		} 
		return true;
	}
	
	public void primes(int start, int end) {
		int count = 0;
		for(; start < end; start++) {
			if(isPrime(start)) {
				count++;
			}
		}
		if(count == 1){
			System.out.println("There is " + count + " prime number."); 
		}
		else{
			System.out.println("There are " + count + " prime numbers.");
		}

	}
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		

	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		double palindrome = 0;
		double x = 0.0;
		int digits = 1; 
		for(int i = 10; number/i > 0; i*=10) {
			digits+=1;
		}
		for(int a = 1; a <= digits; a++) {
			x = number % (Math.pow(10, a));
			palindrome = palindrome + (x * Math.pow(10, (a-1)));
		}
		if (palindrome == number) {
			System.out.println(number + " is a palindromic number.");
		}
		else {
			System.out.println(number + " is not a palindromic number.");
		}
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int a = 1;
		int b = 1;
		int c = 1;
		for(int i = 0; i < n-1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		if (n == 1){
			System.out.println("The 1st Fibonacci number is 1.");
		}
		else if(n < 20 && n > 10){
			System.out.println("The " + n + "th Fibonacci number is " + c + ".");
		}
		else if(n % 10 == 1){
			System.out.println("The " + n + "st Fibonacci number is " + c + ".");
		}
		else if(n % 10 ==2){
			System.out.println("The " + n + "nd Fibonacci number is " + c + ".");
		}
		else if(n % 10 == 3){
			System.out.println("The " + n + "rd Fibonacci number is " + c + ".");
		}
		else {
			System.out.println("The " + n + "th Fibonacci number is " + c + ".");
		}

	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum of all multiples of X and Y less than LIMIT is Z."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		int z = 0;
		int a = x;
		int b = y;
		while(x < limit) {
			z = z + x;
			x =  x + a;
		}
		while(y < limit) {
			if(y % a != 0) {
				z = z + y;
			}
			y = y + b;
		}
		System.out.println("The sum of all multiples of " + a + " and " + b + " less than " + limit + " is " + z + ".");

	}
}
