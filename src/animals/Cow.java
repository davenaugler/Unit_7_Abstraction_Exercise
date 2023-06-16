package animals;

public class Cow extends Animal {

	// Take a look at Cow here. Cow is an Animal, thus we can put him under the
	// umbrella of the class Animal...
	
	public Cow() {
		System.out.println("Cow:");
	}

	@Override
	public void animalSound() {
		System.out.println("Mooooooo!");
	}

}
