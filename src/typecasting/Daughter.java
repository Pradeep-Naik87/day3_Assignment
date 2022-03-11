package typecasting;

public class Daughter extends Father {

	private String daughterName;

	public Daughter(String name, String daughterName) {
		super(name);
		this.daughterName = daughterName;
	}

	public String getDaughterName() {
		return this.daughterName;
	}
}
