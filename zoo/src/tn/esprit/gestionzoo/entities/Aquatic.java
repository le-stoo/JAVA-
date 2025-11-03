package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
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
}