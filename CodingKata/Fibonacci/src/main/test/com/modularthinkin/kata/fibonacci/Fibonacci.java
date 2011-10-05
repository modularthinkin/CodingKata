package com.modularthinkin.kata.fibonacci;


/**
 * @author andreashoppener
 * 
 *         Fibonacci-Folge
 * 
 *         Die Fibonacci-Folge ist eine unendliche Folge von Zahlen (den
 *         Fibonacci-Zahlen), bei der sich die jeweils folgende Zahl durch
 *         Addition ihrer beiden vorherigen Zahlen ergibt: 0, 1, 1, 2, 3, 5, 8,
 *         13, É Benannt ist sie nach Leonardo Fibonacci, der damit 1202 das
 *         Wachstum einer Kaninchenpopulation beschrieb. Die Folge war aber
 *         schon in der indischen und westlichen Antike bekannt.
 * 
 */

public class Fibonacci {
	
	public static void main(String[] args){
		Fibonacci fibonacci = new Fibonacci();
		long calculatedFibonacci = fibonacci.calculateFibonacci(Integer.valueOf(args[0]));
		System.out.println(calculatedFibonacci);
	}

	public Fibonacci() {
	}

	public long calculateFibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		if (n > 2)
			calculateFibonacci(n - 1);

		long m = this.calculateFibonacci(n - 1)
				+ this.calculateFibonacci(n - 2);

		return m;
	}
}