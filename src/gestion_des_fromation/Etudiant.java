package gestion_des_fromation;

import java.util.Arrays;

public class Etudiant extends Personne {
 
    private String[] formationsChoisies;
    private int filiere;

    public Etudiant(String nom, String numEtudiant) {
        super(nom, numEtudiant);
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


    public int getFiliere() {
        return filiere;
    }

    public String[] getFormationsChoisies() {
        return formationsChoisies;
    }

    public void selectFiliere(int filiereChoice) {
        if (filiereChoice >= 1 && filiereChoice <= 5) {
            filiere = filiereChoice;
            System.out.println(nom + " filière " + Filiere.getNomFiliere(filiere));
        } else {
            System.out.println("Choix de filière non valide.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Filière : " + Filiere.getNomFiliere(filiere) +
                ", Formations Choisies : " + Arrays.toString(formationsChoisies);
    }

	public String getNom() {
		return nom;
	}

	public Object getSpecialite() {
		return null;
	}
}

