package animals;

public class Pig extends Animal {

	public Pig() {
		System.out.println("Pig:");
	}

	@Override
	public void animalSound() {
		System.out.println("Oink!");
	}

}
