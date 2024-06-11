
public class Rectangle implements Shape {
	int length,breadth,area,perimeter;
	public void computeArea() {
		length=10;
		breadth=20;
		area = length*breadth;
	}
	public void computePerimeter() {
		length=10;
		breadth=20;
		area = 2*(length+breadth);
	}
	public void showArea() {
		System.out.println("Area of rectangle:"+area);
	}
	public void showPerimeter() {
		System.out.println("perimeter of rectangle:"+perimeter);
	}

}
