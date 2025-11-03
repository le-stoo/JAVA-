
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            System.out.println("\nSearching for " + animal1.name + ":");
            Animal found = zoo.searchAnimal(animal1.name);
            if (found != null) {
                System.out.println("Found: " + found);
            } else {
                System.out.println("Animal not found!");
            }
            
            System.out.println("\nSearching animals from family " + animal1.family + ":");
            Animal[] familyMembers = zoo.searchAnimalByFamily(animal1.family);
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