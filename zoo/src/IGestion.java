public interface IGestion<T> {
    void ajouterEmployee(T t);

    boolean rechercherEmployee(String nom);

    boolean rechercherEmployee(T t);

    void supprimerEmployee(T t);

    void displayEmployee();
}
