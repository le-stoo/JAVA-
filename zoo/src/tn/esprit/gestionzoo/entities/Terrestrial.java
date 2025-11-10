package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    private int nbrLegs;

    // Default constructor
    public Terrestrial() {
        super(null, null, 0, false);
    }

    // Parameterized constructor
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + ", Terrestrial{" +
                "nbrLegs=" + nbrLegs +
                '}';
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("The terrestrial animal is eating meat");
        } else {
            System.out.println("This food type is not suitable for eating meat!");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("The terrestrial animal is eating plants");
        } else {
            System.out.println("This food type is not suitable for eating plants!");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("The terrestrial animal is eating both plants and meat");
        } else {
            System.out.println("This food type is not suitable for eating both plants and meat!");
        }
    }
}