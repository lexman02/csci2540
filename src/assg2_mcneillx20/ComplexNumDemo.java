/*
 * @author - Xavier McNeill
 * A class to test the ComplexNum class
 */
package assg2_mcneillx20;

public class ComplexNumDemo {
	public static void main(String[] args) {
		ComplexNum cn1 = new ComplexNum();
		ComplexNum cn2 = new ComplexNum(1.2);
		ComplexNum cn3 = new ComplexNum(0);
		ComplexNum cn4 = new ComplexNum(1.4, 2.4);
		ComplexNum cn5 = new ComplexNum(0, 2.5);
		ComplexNum cn6 = new ComplexNum(1.6, 0);

		// Test getReal()
		System.out.println("Real Number \"cn1\": " + cn1.getReal());
		System.out.println("Real Number \"cn2\": " + cn2.getReal());
		System.out.println("Real Number \"cn3\": " + cn3.getReal());
		System.out.println("Real Number \"cn4\": " + cn4.getReal());
		System.out.println("Real Number \"cn5\": " + cn5.getReal());
		System.out.println("Real Number \"cn6\": " + cn6.getReal());
		System.out.println();

		// Test getImaginary()
		System.out.println("Imaginary Number \"cn1\": " + cn1.getImaginary());
		System.out.println("Imaginary Number \"cn2\": " + cn2.getImaginary());
		System.out.println("Imaginary Number \"cn3\": " + cn3.getImaginary());
		System.out.println("Imaginary Number \"cn4\": " + cn4.getImaginary());
		System.out.println("Imaginary Number \"cn5\": " + cn5.getImaginary());
		System.out.println("Imaginary Number \"cn6\": " + cn6.getImaginary());
		System.out.println();

		// Test toString()
		System.out.println("\"cn1\": " + cn1);
		System.out.println("\"cn2\": " + cn2.toString());
		System.out.println("\"cn3\": " + cn3);
		System.out.println("\"cn4\": " + cn4);
		System.out.println("\"cn5\": " + cn5);
		System.out.println("\"cn6\": " + cn6);
		System.out.println();

		// Test setReal()
		cn1.setReal(1.1);
		cn2.setReal(1.2);
		cn3.setReal(1.3);
		cn4.setReal(1.4);
		cn5.setReal(1.5);
		cn6.setReal(1.6);

		// Test setImaginary()
		cn1.setImaginary(2.1);
		cn2.setImaginary(2.2);
		cn3.setImaginary(2.3);
		cn4.setImaginary(2.4);
		cn5.setImaginary(2.5);
		cn6.setImaginary(2.6);

		// Test neg()
		System.out.println("Opposite sign of \"cn1\": " + cn1.neg());
		System.out.println("Opposite sign of \"cn2\": " + cn2.neg());
		System.out.println("Opposite sign of \"cn3\": " + cn3.neg());
		System.out.println("Opposite sign of \"cn4\": " + cn4.neg());
		System.out.println("Opposite sign of \"cn5\": " + cn5.neg());
		System.out.println("Opposite sign of \"cn6\": " + cn6.neg());
		System.out.println();

		// Test add()
		System.out.println("\"cn1\" + \"cn2\": " + cn1.add(cn2));
		System.out.println("\"cn2\" + \"cn3\": " + cn2.add(cn3));
		System.out.println("\"cn3\" + \"cn4\": " + cn3.add(cn4));
		System.out.println("\"cn4\" + \"cn5\": " + cn4.add(cn5));
		System.out.println("\"cn5\" + \"cn6\": " + cn5.add(cn6));
		System.out.println("\"cn6\" + \"cn1\": " + cn6.add(cn1));
		System.out.println();

		// Test sub()
		System.out.println("\"cn1\" - \"cn2\": " + cn1.sub(cn2));
		System.out.println("\"cn2\" - \"cn3\": " + cn2.sub(cn3));
		System.out.println("\"cn3\" - \"cn4\": " + cn3.sub(cn4));
		System.out.println("\"cn4\" - \"cn5\": " + cn4.sub(cn5));
		System.out.println("\"cn5\" - \"cn6\": " + cn5.sub(cn6));
		System.out.println("\"cn6\" - \"cn1\": " + cn6.sub(cn1));
		System.out.println();

		// Test mul()
		System.out.println("\"cn1\" * \"cn2\": " + cn1.mul(cn2));
		System.out.println("\"cn2\" * \"cn3\": " + cn2.mul(cn3));
		System.out.println("\"cn3\" * \"cn4\": " + cn3.mul(cn4));
		System.out.println("\"cn4\" * \"cn5\": " + cn4.mul(cn5));
		System.out.println("\"cn5\" * \"cn6\": " + cn5.mul(cn6));
		System.out.println("\"cn6\" * \"cn1\": " + cn6.mul(cn1));
		System.out.println();

		// Test equals()
		System.out.println("\"cn1\" == \"cn2\": " + cn1.equals(cn2)); // false

		// Set "cn3" real number equal to "cn2" real number to test equals()
		cn3.setReal(cn2.getReal());

		System.out.println("\"cn2\" == \"cn3\": " + cn2.equals(cn3)); // false

		// Set "cn4" imaginary and real number equal to "cn3" imaginary and real number
		// to test equals()
		cn4.setReal(cn3.getReal());
		cn4.setImaginary(cn3.getImaginary());

		System.out.println("\"cn3\" == \"cn4\": " + cn3.equals(cn4)); // true

		System.out.println("\"cn4\" == \"cn5\": " + cn4.equals(cn5)); // false
		System.out.println("\"cn5\" == \"cn6\": " + cn5.equals(cn6)); // false
		System.out.println("\"cn6\" == \"cn1\": " + cn6.equals(cn1)); // false

	}
}
