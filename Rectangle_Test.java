import static org.junit.Assert.*;

import org.junit.Test;

public class Rectangle_Test {

	@Test
	public void testGetSide() {
		Point p1 = new Point (0, 0);
		Point p2 = new Point (3, 0);
		assertNotEquals("Points overlap", p1, p2);
	}
	
	public void testGetArea() {
		Point p1 = new Point (0, 0);
		Point p2 = new Point (3, 0);
		Point p3 = new Point (3, 2);
		Point p4 = new Point (0, 2);
		
		Rectangle r = new Rectangle (p1, p2, p3, p4);
		
		assertSame(6, r.getArea(p1, p2, p3));
	}
	
	public void testGetPeremiter() {
		Point p1 = new Point (0, 0);
		Point p2 = new Point (3, 0);
		Point p3 = new Point (3, 2);
		Point p4 = new Point (0, 2);
		
		Rectangle r = new Rectangle (p1, p2, p3, p4);
		
		assertSame(10, r.getPeremiter(p1, p2, p3));
	}
}