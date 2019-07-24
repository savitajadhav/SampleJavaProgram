
public class ConstructorExample {

	public static void main(String[] args) {
		Rectanglearea r1 = new Rectanglearea();

	}

}

class Rectanglearea{
	int length;
	int breadth;
	public int getArea()
	{
		int area;
		area = length*breadth;
		return area;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
}
