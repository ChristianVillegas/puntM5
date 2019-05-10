import org.junit.*;
import org.junit.Assert;

public class TestSegment {
	@Test
	public void testPuntConstructor() {
		// comprova que el constructor Punt() pugui ser cridat
		Segment s = new Segment();
	}

	@Test
	public void testPuntBuit() {
		// comprova que el constructor Punt() deixi a 0 els valors
		Segment s = new Segment();
		Assert.assertEquals(0, s.getX1()); // Afirma que la coordenada x1 val 0
		Assert.assertEquals(0, s.getY1());
		Assert.assertEquals(0, s.getX2());
		Assert.assertEquals(0, s.getY2());
	}

	@Test
	public void testPuntSetX1AssignaCorrectament() {
		Segment s = new Segment();
		s.setX1(12);
		Assert.assertEquals(12, s.getX1());
	}
	
	@Test
	public void testPuntSetX2AssignaCorrectament() {
		Segment s = new Segment();
		s.setX2(10);
		Assert.assertEquals(10, s.getX2());
	}

	@Test
	public void testPuntSetY1AssignaCorrectament() {
		Segment s = new Segment();
		s.setY1(12);
		Assert.assertEquals(12, s.getY1());
	}
	
	@Test
	public void testPuntSetY2AssignaCorrectament() {
		Segment s = new Segment();
		s.setY2(10);
		Assert.assertEquals(10, s.getY2());
	}

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestPunt");
	}
}
