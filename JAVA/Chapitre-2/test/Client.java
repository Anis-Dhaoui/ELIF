public class Client {
    
    // Declaration des variables:
    String nom, adresse;
    int cin;
    float poid;

    // Les methodes:
    float payer(float uht){
        return poid * uht;
    }
    void afficher(){
        System.out.println("M./Mme " + nom + "habite a " + adresse);
    }
    int num_cin(){
        return cin;
    }
}