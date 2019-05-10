import org.junit.*;
import org.junit.Assert;

public class TestPunt {
	@Test
	public void testPuntConstructor() {
		// comprova que el constructor Punt() pugui ser cridat
		Punt p = new Punt();
	}

	@Test
	public void testPuntBuit() {
		// comprova que el constructor Punt() deixi a 0 els valors
		Punt p = new Punt();
		Assert.assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
		Assert.assertEquals(0, p.getY());
	}

	@Test
	public void testPuntSetXAssignaCorrectament() {
		Punt p = new Punt();
		p.setX(12);
		Assert.assertEquals(12, p.getX());
	}

	@Test
	public void testPuntSetYAssignaCorrectament() {
		Punt p = new Punt();
		p.setY(12);
		Assert.assertEquals(12, p.getY());
	}

	@Test
	public void testPuntDefinit() {
		// comprova que el constructor Punt(int,int) deixi els valors correctes
		Punt p = new Punt(3, 4);
		Assert.assertEquals(3, p.getX());
		Assert.assertEquals(4, p.getY());
	}

	@Test
	public void testSuma() {
		// comprova que el métode suma(Punt p) funcioni correctament
		Punt p = new Punt(5, 2);
		Punt q = new Punt(5, 4);
		p.suma(q);
		Assert.assertEquals(10, p.getX());
		Assert.assertEquals(6, p.getY());
	}

	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("TestPunt");
	}
}
