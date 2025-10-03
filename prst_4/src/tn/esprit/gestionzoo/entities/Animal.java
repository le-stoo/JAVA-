package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);  
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "7ayawen (7achek)" +
                "naou3ou" + family + '\'' +
                "issmou" + name + '\'' +
                "3mrou" + age +
                " is thadiayette ? " + isMammal;
    }
}