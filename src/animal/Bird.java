package animal;

public abstract class Bird {
	
	String name;
	
	public abstract void fly();
	
	public abstract void sing();
	
	public abstract String toString();

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
