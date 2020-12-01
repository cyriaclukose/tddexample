package com.example.demo;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {
	
	
	@Test
	public void testNumber() {

		int number = 2;
		FizzBuzz fizzBUzz = new FizzBuzz();

		String actualout = fizzBUzz.play(number);

		Assert.assertEquals("2", actualout);
	}
	
	@Test
	public void testForFizz()
	{
		int number = 6;
		FizzBuzz fizzBUzz = new FizzBuzz();

		String actualout = fizzBUzz.play(number);

		Assert.assertEquals("fizz", actualout);
		
	}
	
	@Test
	public void testForBuzz()
	{
		int number = 10;
		FizzBuzz fizzBUzz = new FizzBuzz();

		String actualout = fizzBUzz.play(number);

		Assert.assertEquals("buzz", actualout);
		
	}
	
	
	@Test
	public void testForFizzBuzz()
	{
		int number = 30;
		FizzBuzz fizzBUzz = new FizzBuzz();

		String actualout = fizzBUzz.play(number);

		Assert.assertEquals("fizzbuzz", actualout);
		
	}

}
