package gestion_des_fromation;

public class Filiere {
    private String nom;

    public Filiere(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public static String getNomFiliere(int code) {
        switch (code) {
            case 1:
                return "TI";
            case 2:
                return "GC";
            case 3:
                return "GE";
            case 4:
                return "GM";
            case 5:
                return "SE";
            default:
                return "Inconnue";
        }
    }
}
