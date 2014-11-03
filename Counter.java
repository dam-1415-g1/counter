package cat.infobosccoma.mp05.uf2;

public class Counter {

	private int result = 0;

	public int getResult() {
		return result;
	}
//Metode count suma fins a deu
	public void count() {
		for (int i = 0; i < 10; i++) {
			result += i + 1;
		}
	}

	public void resetResult() {
		result = 0;
	}

	public void setResult(int newResult) {
		result = newResult;
	}
}