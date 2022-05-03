package JUnitTest_InClassExample;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestPoint {

	Point p1, p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Point();
		p2 = new Point(2.5, 3.5);
	}

	@Test
	public void testDefaultConstructor() {
		assertEquals("p1's x-coordinate:", 0.0, p1.getX(), 0.01);
		assertEquals("p1's y-coordinate:", 0.0, p1.getY(), 0.01);
	}

	@Test
	public void testTwoParameterConstructor() {
		assertEquals("p2's x-coordinate:", 2.5, p2.getX(), 0.01);
		assertEquals("p2's y-coordinate:", 3.5, p2.getY(), 0.01);
	}

	@Test
	public void testSetX() {
		p1.setX(1.2);
		assertEquals("p1's new x-coordinate:", 1.2, p1.getX(), 0.01);
	}

	@Test
	public void testSetY() {
		p1.setY(1.5);
		assertEquals("p1's new y-coordinate:", 1.5, p1.getY(), 0.01);
	}

	@Test
	public void testToString() {
		assertEquals("p2's coordinates:", "(2.5, 3.5)", p2.toString());
	}

	@Test
	public void testDistance() {
		Point p3 = new Point(1.0, 2.0);
		assertEquals("Distance between p2 and p3", Math.sqrt(4.5), p2.distance(p3), 0.01);
	}

}
