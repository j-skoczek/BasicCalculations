class Rectangle {
	private Point point1;
	private Point point2;
	private Point point3;
	private Point point4;
	
	public Rectangle (Point p1, Point p2, Point p3, Point p4) {
		this.point1 = p1;
		this.point2 = p2;
		this.point3 = p3;
		this.point4 = p4;
	}
	
	private double getSide(Point p1, Point p2) {
		
		int x1 = p1.getX();
		int y1 = p1.getY();
		int x2 = p2.getX();
		int y2 = p2.getY();
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	
	public double getArea(Point p1, Point p2, Point p3) {
		
		return getSide(p1, p2)*getSide(p2, p3);
	}
	
	public double getPeremiter(Point p1, Point p2, Point p3) {
		
		return 2*getSide(p1, p2)+2*getSide(p2, p3);
	}
}