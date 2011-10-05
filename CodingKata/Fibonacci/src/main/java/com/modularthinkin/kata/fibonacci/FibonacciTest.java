package com.modularthinkin.kata.fibonacci; 

import org.junit.Test;

public class FibonacciTest {

	private Fibonacci fibo = new Fibonacci();

	@Test
	public void fibonacciForNumbers() {
		
		assert fibo.calculateFibonacci(0) == 0;
		assert fibo.calculateFibonacci(1) == 0;
		assert fibo.calculateFibonacci(5) == 5;
		assert fibo.calculateFibonacci(40) == 102334155;

	}
}
