package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int MAX_ANIMALS = 25;
    private Animal[] animals;
    private Aquatic[] aquaticAnimals;
    private int nbrAnimals;
    private int nbrAquaticAnimals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        setName(name);  // Using setter for validation
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[MAX_ANIMALS];
        this.aquaticAnimals = new Aquatic[10];  // Max 10 aquatic animals
        this.nbrAnimals = 0;
        this.nbrAquaticAnimals = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty");
        }
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public boolean isZooFull() {
        return nbrAnimals >= MAX_ANIMALS;
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquaticAnimals < 10) {
            aquaticAnimals[nbrAquaticAnimals] = aquatic;
            nbrAquaticAnimals++;
        } else {
            System.out.println("Cannot add more aquatic animals. Maximum capacity (10) reached.");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin penguin = (Penguin) aquaticAnimals[i];
                if (penguin.getSwimmingDepth() > maxDepth) {
                    maxDepth = penguin.getSwimmingDepth();
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;
        
        for (int i = 0; i < nbrAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguins++;
            }
        }
        
        System.out.println("Number of Dolphins: " + dolphins);
        System.out.println("Number of Penguins: " + penguins);
    }
    
    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Error: Zoo is full! Maximum capacity is " + MAX_ANIMALS + " animals.");
            return false;
        }
        if (animal == null) {
            return false;
        }
        
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }
    
    public Animal searchAnimal(String name) {
        if (name == null) return null;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && name.equalsIgnoreCase(animals[i].getName())) {
                return animals[i];
            }
        }
        return null;
    }
    
    public Animal[] searchAnimalByFamily(String family) {
        if (family == null) return new Animal[0];
        int count = 0;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && family.equalsIgnoreCase(animals[i].getFamily())) {
                count++;
            }
        }
        
        if (count == 0) return new Animal[0];
        
        Animal[] result = new Animal[count];
        int index = 0;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i] != null && family.equalsIgnoreCase(animals[i].getFamily())) {
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








