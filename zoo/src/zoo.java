import java.util.Arrays;

public class Zoo {
	public Animal[] animals;
	public String name;
	public String city;
	public int nbrCages;

	public Zoo(String name, String city, int nbrCages) {
		this.name = name;
		this.city = city;
		this.nbrCages = nbrCages;
		this.animals = new Animal[25]; // max 25 animals
	}

	public void displayZoo() {
		System.out.println("Zoo name: " + name);
		System.out.println("City: " + city);
		System.out.println("Number of cages: " + nbrCages);
		System.out.println("Animals: " + Arrays.toString(animals));
	}

	@Override
	public String toString() {
		return "Zoo{" +
				"name='" + name + '\'' +
				", city='" + city + '\'' +
				", nbrCages=" + nbrCages +
				", animals=" + Arrays.toString(animals) +
				'}';
	}
}
