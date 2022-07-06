import java.util.*;

public class Tableaux {
    static int taille;
    static int tab[];

    public static void main(String[] args) {
    
        saisirNum();
        tab = new  int[taille];
        
        for(int i = 0; i < taille; i++){
            
            do{
                Scanner sc = new Scanner(System.in);
                System.out.println("Donner la valeur de tab[" + i + "]");
                tab[i] = sc.nextInt();
            }while(tab[i]< 0);
        }
        
        for(int i = 0; i < taille; i++){
            System.out.println(tab[i]);
        }
        System.out.println("*************************************************");
        
        afficher(min(tab));
        afficher(minPos(tab));
        
        afficher(max(tab));
        afficher(maxPos(tab));
        
        afficher(moyenne(tab));
        
        afficher(produit(tab));
        
        afficher(nbPositive(tab));
    }
    
    
    
    
    static void saisirNum(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donner la taille de tableau: ");
            taille = sc.nextInt();
        }while(taille == 0);
    }
    
    static void afficher(int show){
        System.out.println(show);
    }
        
    static int min(int t[]){
        int min = t[0];
        for(int i = 1; i < taille; i++){
            if(t[i] < min){
                min = t[i];
            }
        }
        return min;
    }
    
    static int max(int t[]){
        int max = t[0];
        for(int i = 1; i < taille; i++){
            if(t[i] > max){
                max = t[i];
            }
        }
        return max;
    }
    
    static int minPos(int t[]){
        int pos = 0;
        for(int i = 0; i < taille; i++){
            if(min(t) == t[i]){
                pos = i;
            }
        }
        return pos;
    }
    
    static int maxPos(int t[]){
        int pos = 0;
        for(int i = 0; i < taille; i++){
            if(max(t) == t[i]){
                pos = i;
            }
        }
        return pos;
    }
    
    static int moyenne(int t[]){
        int som = 0;
        for(int i = 0; i < taille; i++){
            som += t[i];
        }
        return som / taille;
    }
    
    static int produit(int t[]){
        int prod = 1;
        for(int i = 0; i < taille; i++){
            prod *= t[i];
        }
        return prod;
    }
    
    static int nbPositive(int t[]){
        int nbPos = 0;
        for(int i = 0; i < taille; i++){
            if(t[i] > 0){
                nbPos += 1;
            }
        }
        return nbPos;
    }
}
