

public class Rectangle{
	private double width = 1;
	private double height = 1;
	
	public Rectangle(){
	}
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	//setter and getter
	public void setWidth(double width){
		this.width = width;
	}
	public void setHeight(double height){
		this.height = height;
	}
	public double getHeight(){
		return height;
	}
	public double getWidth(){
		return width;
	}

	//area and perimeter
	public double getArea(){
		return width * height;
	}
	public double getPerimeter(){
		return 2 * (width + height);
	}
}