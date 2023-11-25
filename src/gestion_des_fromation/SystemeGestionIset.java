package gestion_des_fromation;
public class SystemeGestionIset {
    public static void main(String[] args) {
        SystemeGestionIset isetSystem = new SystemeGestionIset();
        isetSystem.demarrerSysteme();
    }

    public void demarrerSysteme() {
        Formateur formateur1 = new Formateur("John Doe", "T001", "Java");
        Formateur formateur2 = new Formateur("Jane Smith", "T002", "Python");

        Formation formation1 = new Formation("Programmation Java", "2023-12-01", 10, formateur1, "Informatique");
        Formation formation2 = new Formation("Bases de données", "2023-12-02", 15, formateur2, "Informatique");

        afficherDetailsFormation(formation1);
        afficherDetailsFormation(formation2);
    }

    public void afficherDetailsFormation(Formation formation) {
        System.out.println(formation.toString());
    }
}
