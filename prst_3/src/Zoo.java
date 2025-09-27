public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private static final int NBRCAGES = 25;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        animals = new Animal[NBRCAGES];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }

    public boolean isZooFull() {
        return nbrAnimals >= NBRCAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || isZooFull() || searchAnimal(animal) != -1) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        if (animal == null) return -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            return false;
        }
        
        // Shift all animals after the removed one
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        return true;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1 == null) return z2;
        if (z2 == null) return z1;
        return z1.nbrAnimals >= z2.nbrAnimals ? z1 : z2;
    }

    public void displayZoo() {
        System.out.println("isem il 7adi9a: " + name);
        System.out.println("ilblassa " + city);
        System.out.println("3adad il 9fassat " + NBRCAGES);
        System.out.println("3adad il 7aywenet: " + nbrAnimals);
    }

    @Override
    public String toString() {
        return "3ana 7adi9a" +
                "ismha" + name + '\'' +
                "fi" + city + '\'' +
                "feha" + NBRCAGES +
                " cage ";
    }
}