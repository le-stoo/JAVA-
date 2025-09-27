public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[25]; 
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("isem il 7adi9a: " + name);
        System.out.println("ilblassa " + city);
        System.out.println("3adad il 9fassat " + nbrCages);
    }

    @Override
    public String toString() {
        return "3ana 7adi9a" +
                "ismha" + name + '\'' +
                "fi" + city + '\'' +
                "feha" + nbrCages +
                " cage ";
    }
}