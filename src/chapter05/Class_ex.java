package chapter05;

class Animal{
	String name;

	public void setName(String name) {
		this.name = name;
	}	
}

public class Class_ex {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		cat.setName("고양이");
		
		Animal dog = new Animal();
		dog.setName("개");

		System.out.println(cat.name);
		System.out.println(dog.name);

	}

}
