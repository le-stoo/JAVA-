package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food> {
    private String habitat;

    // Default constructor
    public Aquatic() {
        super(null, null, 0, false);
    }

    // Parameterized constructor
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return super.toString() + ", Aquatic{" +
                "habitat='" + habitat + '\'' +
                '}';
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("The aquatic animal is eating meat");
        } else {
            System.out.println("This aquatic animal only eats meat!");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Aquatic aquatic = (Aquatic) obj;
        // Two aquatic animals are equal if they have the same name, age and habitat
        return getName().equals(aquatic.getName()) &&
               getAge() == aquatic.getAge() &&
               habitat.equals(aquatic.habitat);
    }
}