


import java.util.Scanner;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Terrestrial;
import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Penguin;

public class Main {
    public static void main(String[] args) {
        // Testing new animal classes with default constructors
        System.out.println("Creating animals with default constructors:");
        Terrestrial terrestrial = new Terrestrial();
        Aquatic aquatic = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        // Testing parameterized constructors
        System.out.println("\nCreating animals with parameterized constructors:");
        Terrestrial lion = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Aquatic fish = new Aquatic("Fish", "Nemo", 1, false, "Ocean");
        Dolphin flipper = new Dolphin("Delphinidae", "Flipper", 10, true, "Ocean", 25.5f);
        Penguin pingu = new Penguin("Spheniscidae", "Pingu", 3, true, "Antarctica", 100.0f);

        // Display all animals
        System.out.println("\nDisplaying all animals:");
        System.out.println("Terrestrial: " + lion);
        System.out.println("Aquatic: " + fish);
        System.out.println("Dolphin: " + flipper);
        System.out.println("Penguin: " + pingu);

        // Testing swim method
        System.out.println("\nTesting swim method:");
        fish.swim();
        flipper.swim();

        // Testing aquatic animals management in Zoo
        Zoo myZoo = new Zoo("Belvedere", "Tunis", 25);
        
        // Adding aquatic animals
        myZoo.addAquaticAnimal(fish);
        myZoo.addAquaticAnimal(flipper);
        myZoo.addAquaticAnimal(pingu);
        
        // Testing max swimming depth for penguins
        System.out.println("\nMaximum Penguin swimming depth: " + myZoo.maxPenguinSwimmingDepth() + " meters");
        
        // Display number of each type of aquatic animal
        System.out.println("\nAquatic Animals Count:");
        myZoo.displayNumberOfAquaticsByType();
        
        // Testing equals method
        Aquatic fish2 = new Aquatic("Fish", "Nemo", 1, false, "Ocean");
        System.out.println("\nTesting equals method:");
        System.out.println("Are fish and fish2 equal? " + fish.equals(fish2));  // Should be true
        System.out.println("Are fish and flipper equal? " + fish.equals(flipper));  // Should be false

        // Continue with zoo management
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter zoo name:");
            String name = sc.nextLine();
            
            System.out.println("Enter zoo city:");
            String city = sc.nextLine();
            
            System.out.println("Enter number of cages in " + name + ":");
            int nbrCages = sc.nextInt();
            sc.nextLine(); // consume newline
            
            Zoo zoo = new Zoo(name, city, nbrCages);
            
            // Create and add an animal
            System.out.println("\nAdd an animal:");
            System.out.println("Enter animal family:");
            String family = sc.nextLine();
            
            System.out.println("Enter animal name:");
            String animalName = sc.nextLine();
            
            System.out.println("Enter animal age:");
            int age = sc.nextInt();
            sc.nextLine(); // consume newline
            
            System.out.println("Is it a mammal? (true/false):");
            boolean isMammal = sc.nextBoolean();
            sc.nextLine(); // consume newline after boolean
            
            Animal animal1 = new Animal(family, animalName, age, isMammal);
            if (!zoo.addAnimal(animal1)) {
                System.out.println("Failed to add " + animalName + " to the zoo.");
                return;
            }
            
            // Add another animal
            System.out.println("\nAdd another animal:");
            System.out.println("Enter animal family:");
            family = sc.nextLine();
            
            System.out.println("Enter animal name:");
            animalName = sc.nextLine();
            
            System.out.println("Enter animal age:");
            age = sc.nextInt();
            sc.nextLine(); // consume newline
            
            System.out.println("Is it a mammal? (true/false):");
            boolean isSecondMammal = sc.nextBoolean();
            sc.nextLine(); // consume newline after boolean
            
            Animal animal2 = new Animal(family, animalName, age, isSecondMammal);
            if (!zoo.addAnimal(animal2)) {
                System.out.println("Failed to add " + animalName + " to the zoo.");
                return;
            }
            
            // Display zoo information
            System.out.println("\nZoo Information:");
            zoo.displayZoo();
            
            // Test search functionality
            System.out.println("\nSearching for " + animal1.getName() + ":");
            Animal found = zoo.searchAnimal(animal1.getName());
            if (found != null) {
                System.out.println("Found: " + found);
            } else {
                System.out.println("Animal not found!");
            }
            
            System.out.println("\nSearching animals from family " + animal1.getFamily() + ":");
            Animal[] familyMembers = zoo.searchAnimalByFamily(animal1.getFamily());
            if (familyMembers.length > 0) {
                for (Animal a : familyMembers) {
                    System.out.println("- " + a);
                }
            } else {
                System.out.println("No animals found from this family!");
            }
        } finally {
            sc.close();
        }
    }
}