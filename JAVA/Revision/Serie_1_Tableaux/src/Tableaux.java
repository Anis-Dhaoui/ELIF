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
    }
    
    static void saisirNum(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donner la taille de tableau: ");
            taille = sc.nextInt();
        }while(taille < 0);
    }
}
