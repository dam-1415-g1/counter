package cat.infobosccoma.mp05.uf2;


public class Program {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.count();
		System.out.println("El contingut de result és: " + counter.getResult());
	}

}
