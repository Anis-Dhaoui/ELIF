public class Journal extends Document{

    private boolean impressionCouleur;

    //TODO8 (0,75 pts)
    public Journal(boolean impressionCouleur, String auteur, String titre, int nbrPages, float benefice)
    {
        super(auteur, titre, nbrPages, benefice);
        this.impressionCouleur = impressionCouleur;
    }

    public boolean isImpressionCouleur() {
        return impressionCouleur;
    }

    public void setImpressionCouleur(boolean impressionCouleur) {
        this.impressionCouleur = impressionCouleur;
    }

    //TODO10 (0,5 pts)
    @Override
    public int calculerNombreDePapierNecessaire() {
        return getNbrPages()/2;
    }

    //TODO11 (0,5 pts)
    @Override
    public int calculerNombreDeDocumentImprimable(int nbrPapiers) {
        return nbrPapiers/20;
    }

    //TODO9 (0,5 pts)
    public String toString(){
        String resultat = "id: "+super.id+" auteur: "+super.auteur+" titre: "+super.titre;

        if (impressionCouleur)
            resultat += " en couleur";
        else
            resultat += " en noir et blanc";

        return resultat;
    }

}
