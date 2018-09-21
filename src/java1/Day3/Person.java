package java1.Day3;

public class Person {
	
	int age;
	private String name;
	protected int height;
	int weight;
	
	public Person(int age, String name, int height, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public Person(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

