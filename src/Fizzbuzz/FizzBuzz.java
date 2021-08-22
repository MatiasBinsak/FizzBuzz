package Fizzbuzz;

public class FizzBuzz {

	/*
	 * Imprimir por pantalla los números del 1 al 100 pero considerando lo
	 * siguiente: Si el número es divisible por 3 se debe imprimir Fizz. Si el
	 * número es divisible por 5 se debe imprimir Buzz. Si el número es divisible
	 * por 3 y por 5 se debe imprimir FizzBuzz.
	 */

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			String palabra = "";
			if (i % 3 == 0)	palabra += "Fizz";
			if (i % 5 == 0)	palabra += "Buzz";
			if (i % 3 != 0&&i % 5 != 0) palabra = String.valueOf(i);
			System.out.println(palabra);
		}
	}
}
