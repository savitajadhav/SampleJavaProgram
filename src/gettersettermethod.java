
public class GetterSetterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = new Rectangle();
		r1.setLength(20);
		r1.setBreadth(40);
		Rectangle r2 =r1;
		r2.setLength(100);
		r2.setBreadth(50);
		System.out.println("The length of Rectangle is:" +r1.getLength());
		System.out.println("The breadth of Rectangle is:" +r1.getBreadth());
		System.out.println("The area of Rectangle is:" + r1.getArea());
		System.out.println("The Perimeter of Rectangle is:" +r1.getPerimeter());
				
	}

}
class Rectangle{
	 float length;
	float breadth;
	public float getArea()
	{
		float area = length * breadth;
		return area;
	}
	public float getPerimeter()
	{
		float p = 2 *(length + breadth);
		return p;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getBreadth() {
		return breadth;
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	
}
