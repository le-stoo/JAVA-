public class Employee {
    private int id;
    private String nom;
    private String prenom;
    private String departement;
    private int grade;

    // Constructors
    public Employee() {
    }

    public Employee(int id, String nom, String prenom, String departement, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.grade = grade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public int getGrade() {
        return grade;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // equals method - compare by id and nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return this.id == other.id && this.nom.equals(other.nom);
    }

    // toString method
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }
}
