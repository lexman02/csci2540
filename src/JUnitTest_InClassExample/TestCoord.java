package JUnitTest_InClassExample;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCoord {

	Point p1, p2;

	@Before
	public void setUp() throws Exception {
		p1 = new Point();
		p2 = new Point(1.5, 2.0);
	}

	@Test
	public void testGetX() {
		assertEquals("p1 x coordinate", 0.0, p1.getX(), 0.01);
		assertEquals("p2 x coordinate", 1.5, p2.getX(), 0.01);
	}

}
