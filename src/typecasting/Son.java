package typecasting;

public class Son extends Father {

	private String sonName;

	public Son(String name, String sonName) {
		super(name);
		this.sonName = sonName;
	}

	public String getSonName() {
		return this.sonName;
	}
}
