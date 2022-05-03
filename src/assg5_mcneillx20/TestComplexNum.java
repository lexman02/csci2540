/**
 * @author Xavier McNeill
 * A JUnit4 test class for the ComplexNum class
 */
package assg5_mcneillx20;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestComplexNum {
	ComplexNum c1, c2, c3;

	@Before
	public void setUp() throws Exception {
		c1 = new ComplexNum();
		c2 = new ComplexNum(2);
		c3 = new ComplexNum(3, 4);
	}

	@Test
	public void testDefaultConstructor() {
		assertEquals("c1's real number is: ", 0, c1.getReal(), 0.01);
		assertEquals("c1's imaginary number is: ", 0, c1.getImaginary(), 0.01);
	}

	@Test
	public void testOneParameterConstructor() {
		assertEquals("c2's real number is: ", 2, c2.getReal(), 0.01);
		assertEquals("c2's imaginary number is: ", 0, c2.getImaginary(), 0.01);
	}

	@Test
	public void testTwoParameterConstructor() {
		assertEquals("c3's real number is: ", 3, c3.getReal(), 0.01);
		assertEquals("c3's imaginary number is: ", 4, c3.getImaginary(), 0.01);
	}

	@Test
	public void testSetReal() {
		c1.setReal(1);
		assertEquals("c1's real number is: ", 1, c1.getReal(), 0.01);
	}

	@Test
	public void testSetImaginary() {
		c1.setImaginary(3);
		assertEquals("c1's imaginary number is: ", 3, c1.getImaginary(), 0.01);
	}

	@Test
	public void testAdd() {
		c1.setReal(1);
		c1.setImaginary(2.5);
		ComplexNum c4 = c1.add(c3);
		assertEquals("c4's real number is: ", 4, c4.getReal(), 0.01);
		assertEquals("c4's imaginary number is: ", 6.5, c4.getImaginary(), 0.01);
	}

	@Test
	public void testSub() {
		c1.setReal(1);
		c1.setImaginary(2.5);
		ComplexNum c4 = c3.sub(c1);
		assertEquals("c4's real number is: ", 2, c4.getReal(), 0.01);
		assertEquals("c4's imaginary number is: ", 1.5, c4.getImaginary(), 0.01);
	}

	@Test
	public void testMul() {
		c1.setReal(1);
		c1.setImaginary(2.5);
		ComplexNum c4 = c1.mul(c3);
		assertEquals("c4's real number is: ", -7, c4.getReal(), 0.01);
		assertEquals("c4's imaginary number is: ", 11.5, c4.getImaginary(), 0.01);
	}

	@Test
	public void testNeg() {
		c1.setReal(1);
		c1.setImaginary(2.5);
		ComplexNum c4 = c1.neg();
		assertEquals("c4's real number is: ", -1, c4.getReal(), 0.01);
		assertEquals("c4's imaginary number is: ", -2.5, c4.getImaginary(), 0.01);
	}

	@Test
	public void testToString() {
		assertEquals("c3's string is: ", "3.0+4.0i", c3.toString());
	}

	@Test
	public void testEquals() {
		c1.setReal(2);
		assertTrue("c1 equals c2: ", c1.equals(c2));
		assertFalse("c1 does not equal c3: ", c1.equals(c3));
	}
}
