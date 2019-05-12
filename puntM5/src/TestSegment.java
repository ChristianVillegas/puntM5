import org.junit.*;
import org.junit.Assert;

public class TestSegment {
	@Test
	public void testSegmentConstructor() {
		// comprova que el constructor Punt() pugui ser cridat
		Segment s = new Segment();
	}

	@Test
	public void testSegmentBuit() {
		// comprova que el constructor Punt() deixi a 0 els valors
		Segment s = new Segment();
		Assert.assertEquals(0, s.getX1()); // Afirma que la coordenada x1 val 0
		Assert.assertEquals(0, s.getX2());
		Assert.assertEquals(0, s.getY1());
		Assert.assertEquals(0, s.getY2());
	}

	@Test
	public void testSegmentSetX1AssignaCorrectament() {
		Segment s = new Segment();
		s.setX1(12);
		Assert.assertEquals(12, s.getX1());
	}
	
	@Test
	public void testSegmentSetX2AssignaCorrectament() {
		Segment s = new Segment();
		s.setX2(10);
		Assert.assertEquals(10, s.getX2());
	}

	@Test
	public void testSegmentSetY1AssignaCorrectament() {
		Segment s = new Segment();
		s.setY1(12);
		Assert.assertEquals(12, s.getY1());
	}
	
	@Test
	public void testSegmentSetY2AssignaCorrectament() {
		Segment s = new Segment();
		s.setY2(10);
		Assert.assertEquals(10, s.getY2());
	}
	
	@Test
	public void testLongitud() {
		//comprova que el métode longitud(Segment s) funcioni correctament
		Segment s = new Segment(10, 3, 8, 4);
		s.longitud(s);
		Assert.assertEquals(100, s.getX1());
		Assert.assertEquals(9, s.getX2());
		Assert.assertEquals(64, s.getY1());
		Assert.assertEquals(16, s.getY2());
	}

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestSegment");
	}
}
