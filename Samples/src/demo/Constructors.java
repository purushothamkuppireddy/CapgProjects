package demo;

public class Constructors {
	private String name;
	private String id;

	public Constructors(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	Constructors() {
		System.out.println("I am Demo");

	}

	public void display() {
		System.out.println(name);
		System.out.println(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public static void main(String[] args) {
		//System.out.println("hello world");
		
	}

}
