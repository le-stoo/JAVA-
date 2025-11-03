import java.util.Arrays;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private Animal[] animals;
    private int nbrAnimals;
    public String name;  // Keeping these public as per original requirements
    public String city;
    public int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
        this.nbrAnimals = 0;
    }
    
    public boolean addAnimal(Animal animal) {
        if (nbrAnimals >= MAX_ANIMALS) {
            System.out.println("Error: Zoo is full! Maximum capacity is " + MAX_ANIMALS + " animals.");
            return false;
        }
        
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public Animal searchAnimal(String name) {
        if (name == null) return null;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && name.equalsIgnoreCase(animals[i].name)) {
                return animals[i];
            }
        }
        return null;
    }
    
    public Animal[] searchAnimalByFamily(String family) {
        if (family == null) return new Animal[0];
        int count = 0;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && family.equalsIgnoreCase(animals[i].family)) {
                count++;
            }
        }
        
        if (count == 0) return new Animal[0];
        
        Animal[] result = new Animal[count];
        int index = 0;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && family.equalsIgnoreCase(animals[i].family)) {
                result[index++] = animals[i];
            }
        }
        return result;
    }

    public void displayZoo() {
        System.out.println("Zoo name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of cages: " + nbrCages);
        System.out.println("Number of animals: " + nbrAnimals);
        System.out.println("Animals:");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println("- " + animals[i]);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo{name='").append(name).append('\'')
          .append(", city='").append(city).append('\'')
          .append(", nbrCages=").append(nbrCages)
          .append(", nbrAnimals=").append(nbrAnimals)
          .append(", animals=[");
          
        for (int i = 0; i < nbrAnimals; i++) {
            if (i > 0) sb.append(", ");
            sb.append(animals[i]);
        }
        sb.append("]}");
        return sb.toString();
    }
}








