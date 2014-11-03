package cat.infobosccoma.mp05.uf2;

public class Counter {

	private int result = 0;

	public int getResult() {
		return result;
	}

	public void count() {
		for (int i = 0; i < 10; i++) {
			result += i + 1;
		}
	}
	/* Metode posa result a 0*/
	public void resetResult() {
		result = 0;
	}

	public void setResult(int newResult) {
		result = newResult;
	}
}