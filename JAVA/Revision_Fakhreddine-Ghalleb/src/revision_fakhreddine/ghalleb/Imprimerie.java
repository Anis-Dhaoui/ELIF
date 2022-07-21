public class Imprimerie {



    private final int NBR_MAX_DOCS_JOUR = 5;

    private Document[] docs = new Document[NBR_MAX_DOCS_JOUR];

    private String nom;
    private String adresse;
    private int nbrPapiers;

    public Imprimerie(String nom, String adresse, int nbrPapiers) {
        this.nom = nom;
        this.adresse = adresse;
        this.nbrPapiers = nbrPapiers;
    }

    public int getNBR_MAX_DOCS_JOUR() {
        return NBR_MAX_DOCS_JOUR;
    }

    public Document[] getDocs() {
        return docs;
    }

    public void setDocs(Document[] docs) {
        this.docs = docs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNbrPapiers() {
        return nbrPapiers;
    }

    public void setNbrPapiers(int nbrPapiers) {
        this.nbrPapiers = nbrPapiers;
    }

    //TODO12 (0,5 pts)
    private int nombreActuelDeDocs() {
        int res = 0;

        for (int i=0; i < docs.length ; i++){
            if (docs[i] != null){
                res++;
            }
        }

        return res;
    }

    //TODO13 (1,5 pts)
    public void ajouterDocument(Document doc) throws PlusDePlaceException{
        if (nombreActuelDeDocs() < NBR_MAX_DOCS_JOUR){

            boolean existe = false;

            for(int i=0; i < nombreActuelDeDocs() ; i++){
                if (docs[i].equals(doc)){
                    existe = true;
                    break;
                }
            }

            if (existe == false) {
                docs[nombreActuelDeDocs()] = doc;
            }else{
                System.out.println("Ce document existe ! ");
            }
        }else{
            throw new PlusDePlaceException("Quota maximal du jour atteint ! ");
        }
    }

    //TODO14 (3 pts)
    public void afficherBeneficeTotal() {
        int totalPapier = 0;
        float totalBenefice = 0.0f;

        for(int i=0; i < nombreActuelDeDocs() ; i++){
            //détails
            System.out.println(docs[i]);

            int nombreExmplaire = docs[i].calculerNombreDeDocumentImprimable(nbrPapiers);
            //le nombre d’exemplaires qu’on peut imprimer
            System.out.println("nombreExmplaire: "+nombreExmplaire);

            totalPapier += docs[i].calculerNombreDePapierNecessaire();

            if (docs[i] instanceof Journal){
                Journal d = (Journal) docs[i];
                if (!d.isImpressionCouleur()){
                    totalBenefice += d.getBenefice()*2;
                }
            }else if (docs[i] instanceof Parascolaire){
                Parascolaire d = (Parascolaire) docs[i];
                if (d.getAgeMin() < 7){
                    totalBenefice += d.getBenefice()/2;
                }
            }
        }

        //le papier restant après l’impression
        System.out.println("papier restant = " + (nbrPapiers-totalPapier) );

        //le bénéfice
        System.out.println("bénéfice = " + totalBenefice );

    }

}
