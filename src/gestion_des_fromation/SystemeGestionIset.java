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

        // Adding students for each filiere
        Etudiant etudiantTI = new Etudiant("Ahmed Mohssen", "S001");
        etudiantTI.selectFiliere(1); // Choix de la filière TI
        etudiantTI.choisirFormation(formation1.getNom());

        Etudiant etudiantGC = new Etudiant("Khither Karawita", "S002");
        etudiantGC.selectFiliere(2); // Choix de la filière GC
        etudiantGC.choisirFormation(formation1.getNom());

        Etudiant etudiantGE = new Etudiant("Zohra Lamboba", "S003");
        etudiantGE.selectFiliere(3); // Choix de la filière GE
        etudiantGE.choisirFormation(formation2.getNom());

        Etudiant etudiantGM = new Etudiant("Hlima Jandobi", "S004");
        etudiantGM.selectFiliere(4); // Choix de la filière GM
        etudiantGM.choisirFormation(formation2.getNom());

        // Display student details
        System.out.println("\nListe des étudiants :");
        afficherDetailsEtudiant(etudiantTI);
        afficherDetailsEtudiant(etudiantGC);
        afficherDetailsEtudiant(etudiantGE);
        afficherDetailsEtudiant(etudiantGM);
    }

    public void afficherDetailsFormation(Formation formation) {
        System.out.println(formation.toString());
    }

    public void afficherDetailsEtudiant(Etudiant etudiant) {
        System.out.println(etudiant.toString());
    }
}
