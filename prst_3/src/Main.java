
public class Main {
    public static void main(String[] args) {
        // Create a zoo
        Zoo myZoo = new Zoo("frigia", "9irwen");
        
        // Create some animals
        Animal lion = new Animal("sinaouriette", "simmba", 75, true);
        Animal tiger = new Animal("sinaouriette", "bagira", 60, true);
        Animal lionCopy = new Animal("sinaouriette", "simmba", 75, true);
        

        System.out.println("nzzidou 7aywen (7achek) " + myZoo.addAnimal(lion));
        System.out.println(" nzzidou 7aywen (7achek)" + myZoo.addAnimal(tiger));
        System.out.println("nzidou nafess il 7aywen(should fail): " + myZoo.addAnimal(lionCopy));
        
    
        System.out.println("\nDisplaying all animals:");
        myZoo.displayAnimals();
 
   
        System.out.println("nalwoujou 3ala 7aywen (7achek)" + myZoo.searchAnimal(lion));
        

       
        System.out.println("nfass5ou fi 7awyen (7achek mara o5ra)" + myZoo.removeAnimal(lion));
        System.out.println("ma 7abech " + myZoo.removeAnimal(lion));
        
      
        myZoo.displayZoo();
        
        // Test zoo comparison
        Zoo anotherZoo = new Zoo("bilvider", "tunis");
        anotherZoo.addAnimal(lion);
        anotherZoo.addAnimal(tiger);
        

        Zoo biggerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println( biggerZoo +"akber !");
        
    
        System.out.println("ye5i " + myZoo.isZooFull() +"m3abiya ???");
        
       
    }
}