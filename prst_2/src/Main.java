
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("sinaouriette", "simmba", 75, true);
        Zoo myZoo = new Zoo("frigia", "9irwen", 155);
        //
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(lion);
        System.out.println(lion.toString());
    }
}