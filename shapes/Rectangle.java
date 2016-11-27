package shapes;

public class Rectangle {

	
	private int startHeight;
	
	private int startWidth;
	
	public Rectangle(int height, int width) {

		this.startWidth = width;

		this.startHeight = height;
	}


		
	public int getArea(){


		return startHeight * startWidth;
}
}