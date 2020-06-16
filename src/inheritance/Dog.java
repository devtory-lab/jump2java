package inheritance;

class Animal {	
	String name;

	public void setName(String name) {
		this.name = name;
	}
}

public class Dog extends Animal{
	
	void sleep(){
		System.out.println(this.name + " zzz");
	}

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.setName("poppy");
		System.out.println(dog.name);
		dog.sleep();

	}
}