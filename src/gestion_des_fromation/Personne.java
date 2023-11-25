package gestion_des_fromation;


public class Personne {
    protected String nom;
    protected String numEtudiant;

    public Personne(String nom, String numEtudiant) {
        this.nom = nom;
        this.numEtudiant = numEtudiant;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Numéro d'étudiant : " + numEtudiant;
    }
}
