package cat.infobosccoma.mp05.uf2;

public class Counter {

	private int result = 0;

	public int getResult() {
		return result;
	}
<<<<<<< HEAD
	/*Metode count suma fins a deu*/
=======

	/* Metode count suma fins a deu */
>>>>>>> 4356f9d697aa6855418ec34d229dcd0d7bd250d5
	public void count() {
		for (int i = 0; i < 10; i++) {
			result += i + 1;
		}
	}

	/* Metode posa result a 0 */
	public void resetResult() {
		result = 0;
	}

	public void setResult(int newResult) {
		result = newResult;
	}
}