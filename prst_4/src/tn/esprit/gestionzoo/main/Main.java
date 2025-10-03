package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a zoo
            Zoo myZoo = new Zoo("frigia", "9irwen");
            
            // Create some animals
            Animal lion = new Animal("sinaouriette", "simmba", 75, true);
            Animal tiger = new Animal("sinaouriette", "bagira", 60, true);
            Animal lionCopy = new Animal("sinaouriette", "simmba", 75, true);
            
            // Test adding animals
            System.out.println("\nTesting addAnimal method:");
            System.out.println("Adding lion: " + myZoo.addAnimal(lion));
            System.out.println("Adding tiger: " + myZoo.addAnimal(tiger));
            System.out.println("Adding lion copy (should fail): " + myZoo.addAnimal(lionCopy));
            
            // Display all animals
            System.out.println("\nDisplaying all animals:");
            myZoo.displayAnimals();
            
            // Test searching animals
            System.out.println("\nSearching for lion (should find): " + myZoo.searchAnimal(lion));
            System.out.println("Searching for lion copy (should find): " + myZoo.searchAnimal(lionCopy));
            
            // Test removing animals
            System.out.println("\nTesting removeAnimal method:");
            System.out.println("Removing lion: " + myZoo.removeAnimal(lion));
            System.out.println("Removing lion again (should fail): " + myZoo.removeAnimal(lion));
            
            // Display zoo info
            System.out.println("\nZoo information:");
            myZoo.displayZoo();
            
            // Testing invalid cases
            try {
                Animal invalidAgeAnimal = new Animal("test", "test", -5, true);
            } catch (IllegalArgumentException e) {
                System.out.println("\nCaught expected error: " + e.getMessage());
            }

            try {
                Zoo invalidZoo = new Zoo("", "city");
            } catch (IllegalArgumentException e) {
                System.out.println("Caught expected error: " + e.getMessage());
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}