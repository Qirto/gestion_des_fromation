package gestion_des_fromation;

public class Formateur extends Personne {
    private String expertise;

    public Formateur(String nom, String numFormateur, String expertise) {
        super(nom, numFormateur);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    @Override
    public String toString() {
        return super.toString() + ", Expertise : " + expertise;
    }

	public String getNom() {
		return null;
	}
}
