public abstract class Document {

    //TODO2 (0,5 pts)
    public static int idDocument = 0;

    protected int id;
    protected String titre;
    protected String auteur;

    private int nbrPages;
    private float benefice;

    public Document(String auteur, String titre, int nbrPages, float benefice) {
        this.auteur = auteur;
        this.titre = titre;
        this.nbrPages = nbrPages;
        this.benefice = benefice;
        //TODO2
        this.id = ++idDocument;
    }

    public int getNbrPages() {
        return nbrPages;
    }

    public void setNbrPages(int nbrPages) {
        this.nbrPages = nbrPages;
    }

    public float getBenefice() {
        return benefice;
    }

    public void setBenefice(float benefice) {
        this.benefice = benefice;
    }

    //TODO3 (0,5 pts)
    public String toString(){
        return "id: "+id+" auteur: "+this.auteur+" titre: "+titre;
    }

    //TODO4 (1 pts)
    public boolean equals(Object obj){
        if(obj == null)
            return false;

        if(!(obj instanceof Document))
            return false;

        Document d = (Document) obj;

        if (!this.auteur.equals(d.auteur) && !this.titre.equals(d.titre))
            return false;

        return true;
    }

    //TODO5 (0,5 pts)
    public abstract int calculerNombreDePapierNecessaire();

    //TODO6 (0,5 pts)
    public abstract int calculerNombreDeDocumentImprimable(int nbrPages);

}
