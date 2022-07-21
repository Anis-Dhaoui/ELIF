public class Parascolaire extends Document{

    private int ageMin;

    public Parascolaire(String auteur, String titre, int nbrPages, float benefice, int ageMin) {
        super(auteur, titre, nbrPages, benefice);
        this.ageMin = ageMin;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    @Override
    public int calculerNombreDePapierNecessaire() {
        return 0;
    }

    @Override
    public int calculerNombreDeDocumentImprimable(int nbrPages) {
        return 0;
    }

}
