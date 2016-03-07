package MainTriangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class testTriangles {

	@Test
	public void perimetertest() {
		Triangle t=new Triangle(1,2,3);
		double result=t.getPerimeter();
		assertEquals(6,result,0);
		fail("Not yet implemented");
	}
	@Test
	public void areatest(){
		Triangle t=new Triangle(3,4,5);
		double result=t.getArea();
		assertEquals(6,result,0);
		fail("not yet implemented");
	}

}
