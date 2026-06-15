package practiceoop;

public class Main {
	public static void main(String []args) {
		Animal animal_1=new Animal();
		animal_1.eat();
		Dog animal2=new Dog();
		animal2.bark();
		animal2.eat();
		animal2.makeSound();
		Animal animal3=new Dog();
		animal3.eat();
		animal3.makeSound();
		animal3.bark();
	}

}
