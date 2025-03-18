package generics2_ejercicios;

public class Trio <T, S, R> {
	// ejercicio adicional
	
	private T t;
	private S s;
	private R r;

	public Trio(T t, S s, R r) {
		this.t = t;
		this.s = s;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Trio [t=" + t + ", s=" + s + ", r=" + r + "]";
	}

	public T getT() {
		return t;
	}

	public S getS() {
		return s;
	}

	public R getR() {
		return r;
	}
	
	public static void main(String[] args) {
		// clase generica TRIO
		Trio<String, String, String> t1 = new Trio<>("A", "B", "C  ");
		System.out.println(t1);
	}

}
