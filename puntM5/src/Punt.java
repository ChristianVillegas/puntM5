
public class Punt {
	int[] coord = new int[2];

	public Punt() {
		this(0, 0);
	}

	public Punt(int x, int y) {
		setX(x);
		setY(y);
	}

	public int getX() {
		return coord[0];
	}

	public int getY() {
		return coord[1];
	}

	public void setX(int x) throws IllegalArgumentException {
		if (x>=0) {
				this.coord[0] = x;
		}else {
			throw new IllegalArgumentException();
		}
	}

	public void setY(int y) throws IllegalArgumentException {
		if (y>=0) {
				this.coord[1] = y;
		}else {
			throw new IllegalArgumentException();
		}
	}

	public void suma(Punt p) {
		coord[0] += p.coord[0];
		coord[1] += p.coord[1];
	}
}
