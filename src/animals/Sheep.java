package animals;

public class Sheep extends Animal {
	
	public Sheep() {
		System.out.println("Sheep:");
	}
	

	@Override
	public void animalSound() {
		System.out.println("Baaaa!");
	}

}
