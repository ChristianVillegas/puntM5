
public class Segment {
	Punt p1;
	Punt p2;

	public Segment() {
		p1 = new Punt();
		p2 = new Punt();
	}

	public Segment(Punt p1, Punt p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	/* Retorna el punt segons l'índex (1 o 2)*/
	public Punt get(int index) {
		switch(index) {
		case 1: return p1;
		case 2: return p2;
		default: throw new IllegalArgumentException("Només tinc els punts 1 i 2");
		}
	}
	
	public double longitud() {
		return Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + Math.pow(p1.getY()-p2.getY(), 2));
	}
}
