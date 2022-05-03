package activity6;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateTest {
	Date d1, d2;

	@Before
	public void setUp() throws Exception {
		d1 = new Date();
		d2 = new Date(12, 25, 2022);
	}

	@Test
	public void testDefaultConstructor() {
		assertEquals("d1 month: ", 1, d1.getMonth());
		assertEquals("d1 day: ", 1, d1.getDay());
		assertEquals("d1 year: ", 2000, d1.getYear());
	}

	@Test
	public void testThreeParameterConstructor() {
		assertEquals("d2 month: ", 12, d2.getMonth());
		assertEquals("d2 day: ", 25, d2.getDay());
		assertEquals("d2 year: ", 2022, d2.getYear());
	}

	@Test
	public void testSetMonth() {
		d1.setMonth(4);
		assertEquals("d1 new month: ", 4, d1.getMonth());
	}

	@Test
	public void testSetDay() {
		d1.setDay(25);
		assertEquals("d1 new day: ", 25, d1.getDay());
	}

	@Test
	public void testSetYear() {
		d1.setYear(2002);
		assertEquals("d1 new year: ", 2002, d1.getYear());
	}

	@Test
	public void testToString() {
		assertEquals("d1: ", "1/1/2000", d1.toString());
		assertEquals("d2: ", "12/25/2022", d2.toString());
	}
}
