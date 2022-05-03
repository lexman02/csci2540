/*
 * @author - Xavier McNeill
 * A class for Complex Numbers
 */
package assg5_mcneillx20;

public class ComplexNum {
    private double real;
    private double imaginary;

    /*
     * Default constructor
     */
    public ComplexNum() {
        real = 0;
        imaginary = 0;
    }

    /*
     * Constructor with a given real number
     * @param real The given real number
     */
    public ComplexNum(double real) {
        this.real = real;
        imaginary = 0;
    }

    /*
     * Constructor with a given real and imaginary number
     * @param real The given real number
     * @param imaginary The given imaginary number
     */
    public ComplexNum(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /*
     * Retrieve the real number
     * @return The real number
     */
    public double getReal() {
        return real;
    }

    /*
     * Retrieve the imaginary number
     * @return The imaginary number
     */
    public double getImaginary() {
        return imaginary;
    }

    /*
     * Modify the real number
     * @param newReal The new real number
     */
    public void setReal(double newReal) {
        real = newReal;
    }

    /*
     * Modify the imaginary number
     * @param newImaginary The new imaginary number
     */
    public void setImaginary(double newImaginary) {
        imaginary = newImaginary;
    }

    /*
     * Calculate the sum of two complex numbers
     * @return The sum of two complex numbers
     */
    public ComplexNum add(ComplexNum x) {
        ComplexNum sum = new ComplexNum();
        sum.real = real + x.real;
        sum.imaginary = imaginary + x.imaginary;
        return sum;
    }

    /*
     * Calculate the difference of two complex numbers
     * @return The difference of two complex numbers
     */
    public ComplexNum sub(ComplexNum x) {
        ComplexNum difference = new ComplexNum();
        difference.real = real - x.real;
        difference.imaginary = imaginary - x.imaginary;
        return difference;
    }

    /*
     * Calculate the product of two complex numbers
     * @return The product of two complex numbers
     */
    public ComplexNum mul(ComplexNum x) {
        ComplexNum product = new ComplexNum();
        product.real = (real * x.real) - (imaginary * x.imaginary);
        product.imaginary = (real * x.imaginary) + (imaginary * x.real);
        return product;
    }

    /*
     * Calculate the negation of a complex number
     * @return The negation of a complex number
     */
    public ComplexNum neg() {
        ComplexNum neg = new ComplexNum();
        neg.real = real * -1;
        neg.imaginary = imaginary * -1;
        return neg;
    }

    /*
     * Return the string representation of a complex number
     * @return The string representation of a complex number
     */
    @Override
    public String toString() {
        if (real == 0) {
            return String.format("%.1f", imaginary) + "i";
        } else if (imaginary == 0) {
            return Double.toString(real);
        } else if (imaginary < 0) {
            return String.format("%.1f", real) + "-" + String.format("%.1f", (imaginary * -1)) + "i";
        }

        return String.format("%.1f", real) + "+" + String.format("%.1f", imaginary) + "i";
    }

    /*
     * Compare this complex number with another object
     * @param obj The object to compare
     * @return True if this complex number and the other object are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof ComplexNum) {
            ComplexNum x = (ComplexNum) obj;
            return (real == x.real && imaginary == x.imaginary);
        }

        return false;
    }
}
