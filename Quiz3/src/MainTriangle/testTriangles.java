package MainTriangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangles {

	@Test
	public void perimetertest() {
		Triangle t=new Triangle(1,2,3);
		double output=t.getPerimeter();
		assertEquals(6,output,0);
	}
	@Test
	public void areatest(){
		Triangle t=new Triangle(3,4,5);
		double output=t.getArea();
		assertEquals(6,output,0);
	}

}
