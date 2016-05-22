class Main {
	
	public static void main(String args[]) {
		
		Point p1 = new Point (0, 0);
		Point p2 = new Point (3, 0);
		Point p3 = new Point (3, 3);
		Point p4 = new Point (0, 3);
		
		Rectangle r = new Rectangle (p1, p2, p3, p4);
		
		//System.out.println(+p3.getX());
		System.out.println(r.getArea(p1, p2, p3));
		System.out.println(r.getPeremiter(p1, p2, p3));
	}
}
