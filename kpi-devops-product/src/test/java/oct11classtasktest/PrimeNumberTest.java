package oct11classtasktest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import oct11classtask.PrimeNumber;

public class PrimeNumberTest {
	//for positive numbers
	@Test
	public void testPositivePrime() {
		boolean f1 = PrimeNumber.checkPrime(3);
		assertEquals(true, f1);
		boolean f2 = PrimeNumber.checkPrime(4);
		assertEquals(false, f2);
		boolean f3 = PrimeNumber.checkPrime(5);
		assertEquals(true, f3);

	}
	//for negative numbers
	@Test
	public void testNegativePrime() {
		boolean f1 = PrimeNumber.checkPrime(-3);
		assertEquals(true, f1);
		boolean f2 = PrimeNumber.checkPrime(-4);
		assertEquals(true, f2);
		boolean f3 = PrimeNumber.checkPrime(-5);
		assertEquals(true, f3);

	}
}
