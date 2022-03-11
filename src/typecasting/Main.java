package typecasting;

public class Main {

	public static void main(String[] args) {
		Father f = new Son("Jagannath", "Pradeep"); // Up casting
		System.out.println(f.getFatherName());
		// f.getSonName(); Not able to access the subClass properties with the upcasted
		// reference

		Son s = (Son) f; // Down casting to Son
		System.out.println(s.getSonName() + " has the properties of " + s.getFatherName());
	}

}
