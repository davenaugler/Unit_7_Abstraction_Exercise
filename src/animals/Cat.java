package animals;

public class Cat extends Animal {
	
	public Cat() {
		System.out.println("Cat:");
	}

	@Override
	public void animalSound() {
		System.out.println("Meow!");
	}

}
