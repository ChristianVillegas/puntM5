import org.junit.*;
import org.junit.Assert;

public class TestSegment {
	@Test
	public void testSegmentConstructor() {
		// comprova que el constructor Segment() pugui ser cridat
		Punt p1 = new Punt();
		Punt p2 = new Punt();
	}

	@Test
	public void testSegmentBuit() {
		// comprova que el constructor Segment() deixi a 0 els valors
		Punt p1 = new Punt();
		Punt p2 = new Punt();
		Segment s = new Segment(p1, p2);
		Assert.assertEquals(0, s.get(1).getX());
		Assert.assertEquals(0, s.get(1).getY());
		Assert.assertEquals(0, s.get(2).getX());
		Assert.assertEquals(0, s.get(2).getY());
	}

	@Test
	public void testLongitudSegmentPerDefecte() {
		//comprova que el m�tode longitud() per defecte funcioni correctament
		Segment s = new Segment();
		double longitudEsperada = 0;
		Assert.assertEquals(longitudEsperada, s.longitud(), 0.000001);
	}

	
	@Test
	public void testLongitud() {
		//comprova que el m�tode longitud() funcioni correctament
		Punt p1 = new Punt(3, 5);
		Punt p2 = new Punt(6, 10);
		Segment s = new Segment(p1, p2);
		double longitudEsperada = 5.830951894845301;
		Assert.assertEquals(longitudEsperada, s.longitud(), 0.000001);
	}

	@Test
	public void testLongitud2() {
		//segona prova canviant els valors del mètode longitud()
		Punt p1 = new Punt(5, 3);
		Punt p2 = new Punt(7, 1);
		Segment s = new Segment(p1, p2);
		double longitudEsperada = 2.8284271247461903;
		Assert.assertEquals(longitudEsperada, s.longitud(), 0.000001);
	}

	
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestSegment");
	}
}
