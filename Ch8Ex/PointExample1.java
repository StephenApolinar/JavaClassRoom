// Example of existing Point Object Library.

import java.awt.*;

public class PointExample1 {
	public static void main(String[] args) {
		Point p = new Point(3, 8);
		System.out.println("Initially p = " + p);
		p.translate(-1, -2);
		System.out.println("after translating p = " + p);
	}
}
