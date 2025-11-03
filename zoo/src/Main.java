
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
            
            Animal animal = new Animal(family, animalName, age, isMammal);
            zoo.animals[0] = animal;
            
            // Display zoo information
            System.out.println("\nZoo Information:");
            zoo.displayZoo();
        } finally {
            sc.close();
        }
    }
}