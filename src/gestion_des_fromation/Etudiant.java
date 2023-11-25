package gestion_des_fromation;

import java.util.Arrays;


public class Etudiant extends Personne {
    private String specialite;
    private String[] formationsChoisies;
    private int filiere;

    public Etudiant(String nom, String numEtudiant, String specialite) {
        super(nom, numEtudiant);
        this.specialite = specialite;
        this.formationsChoisies = new String[3];
    }

    public void choisirFormation(String formation) {
        for (int i = 0; i < formationsChoisies.length; i++) {
            if (formationsChoisies[i] == null) {
                formationsChoisies[i] = formation;
                System.out.println(nom + " a choisi " + formation);
                return;
            }
        }
        System.out.println(nom + " a déjà choisi 3 formations.");
    }

    public boolean aChoisiFormation(String formation) {
        for (String choix : formationsChoisies) {
            if (formation.equals(choix)) {
                return true;
            }
        }
        return false;
    }

    public String getSpecialite() {
        return specialite;
    }

    public int getFiliere() {
        return filiere;
    }

    public String[] getFormationsChoisies() {
        return formationsChoisies;
    }

    @Override
    public String toString() {
        return super.toString() + ", Spécialité : " + specialite + ", Filière : " + filiere +
                ", Formations Choisies : " + Arrays.toString(formationsChoisies);
    }

    public void choisirFiliere(int choixFiliere) {
        if (choixFiliere >= 1 && choixFiliere <= 5) {
            filiere = choixFiliere;
            System.out.println(nom + " a choisi la filière " + filiere);
        } else {
            System.out.println("Choix de filière non valide.");
        }
    }

	public String getNom() {
		return null;
	}
}

