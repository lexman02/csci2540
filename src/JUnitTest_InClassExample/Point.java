/**
 * @author Qin Ding
 * This class is for point with x and y coordinates.
 */

package JUnitTest_InClassExample;

public class Point {

	private double x, y;

	/**
	 * Default constructor
	 */
	public Point() {
		x = 0;
		y = 0;
	}

	/**
	 * Constructor with given x and y coordinates
	 * @param xCoor The given x coordinate
	 * @param yCoor The given y coordinate
	 */
	public Point(double xCoor, double yCoor) {
		x = xCoor;
		y = yCoor;
	}

	/**
	 * The get method for x coordinate
	 * @return The value of x coordinate
	 */
	public double getX() {
		return x;
	}

	/**
	 * The get method for y coordinate
	 * @return The value of y coordinate
	 */
	public double getY() {
		return y;
	}

	/**
	 * The set method for x coordinate
	 * @param newX The new value for x coordinate
	 */
	public void setX(double newX) {
		x = newX;
	}

	/**
	 * The set method for y coordinate
	 * @param newY The new value for y coordinate
	 */
	public void setY(double newY) {
		y = newY;
	}

	/**
	 * This method calculates the distance between this point and a given point.
	 * @param p The given point
	 * @return The distance between this point and a given point p.
	 */
	public double distance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y));
	}

	/**
	 * This method converts the point to a string in the format of (x, y)
	 * @return It returns the string in the format of (x, y)
	 */
	@Override
	public String toString() {
		String str = "(" + x + ", " + y + ")";
		return str;
	}

}
