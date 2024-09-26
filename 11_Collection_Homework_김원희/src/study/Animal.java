package study;

public abstract class Animal {
	
	protected String name;
	
	public Animal() {}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();
}
