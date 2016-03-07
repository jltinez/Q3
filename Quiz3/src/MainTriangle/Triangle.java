package MainTriangle;
/*Joaquin Martinez Q3 CISC181*/
public class Triangle extends GeometricObject {
	private double side1=1.0;
	private double side2=1.0;
	private double side3=1.0;
	
	public Triangle(){
	}
	public Triangle(double side1,double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getside1(){
		return side1;
	}
	public double getside2(){
		return side2;
	}
	public double getside3(){
		return side3;
	}
	public double getPerimeter(){
		double P=(side1+side2+side3);
		return P;
	}
	public double getArea(){
		double hP=getPerimeter()/2;
		double A=Math.sqrt(hP*(hP-side1)*(hP-side2)*(hP-side3));
		return A;
	}
	public String toString(){
		return "triangle with sides"+side1+","+side2+", and"+side3+" has a perimeter of "
			+getPerimeter()+"and an area of "+getArea()+"." ;
	}
}

