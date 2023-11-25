package gestion_des_fromation;

public class Formation {
    private String nom;
    private String date;
    private int placesDisponibles;
    private Formateur formateur;
    private String specialite;

    public Formation(String nom, String date, int placesDisponibles, Formateur formateur, String specialite) {
        this.nom = nom;
        this.date = date;
        this.placesDisponibles = placesDisponibles;
        this.formateur = formateur;
        this.specialite = specialite;
    }

    public String getNom() {
        return nom;
    }

    public String getDate() {
        return date;
    }

    public int getPlacesDisponibles() {
        return placesDisponibles;
    }

    public Formateur getFormateur() {
        return formateur;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void inscrireEtudiant(Etudiant etudiant) {
        if (placesDisponibles > 0 && specialite.equals(etudiant.getSpecialite()) && !etudiant.aChoisiFormation(nom)) {
            etudiant.choisirFormation(nom);
            placesDisponibles--;
            System.out.println(etudiant.getNom() + " a été inscrit(e) à " + nom);
        } else {
            System.out.println("Inscription échouée pour " + etudiant.getNom() + " à " + nom);
        }
    }

    @Override
    public String toString() {
        return "Formation : " + nom + ", Date : " + date + ", Places Disponibles : " + placesDisponibles +
                ", Formateur : " + formateur.getNom() + ", Spécialité : " + specialite;
    }
}
