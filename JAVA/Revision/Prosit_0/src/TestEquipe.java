import java.util.*;

public class TestEquipe {
    static int a, b, x;
    
    public static void main(String arg[]){
        //PARTIE 1:
        int n1 = 5;
        int n2 = 6;
        float somme = 0;
        
        somme = n1 + n2;
        System.out.println("Le resultat est: " + somme);
        
        //sans le mot clé static devant la methode somme je *
        //doit créer un instance pour je peux utilisé cette methode
        TestEquipe som = new TestEquipe();
        System.out.println(som.somme(10, 20));
      
        
        //et maintenant il est plus simple pour utilisé la methode somme en ajoutant static
        System.out.println(somme(100, 50));
        
        afficher(somme(50,60));
        
        saisirNum();
        System.out.println("La somme des valeurs tu as saisis est:    ");
        afficher(somme(a, b));
        
        saisirX();
        System.out.println("La double de valeur tu as saisis est:    ");
        afficher(doubleX(x));
    }
    
    
    
    
    
    //PARTIE 3:
    static int somme(int num1, int num2){
        return num1 + num2;
    }

    //PARTIE 4:
    static void afficher(int val){
        System.out.println(val);
    }

    //PARTIE 6: PARTIE 9:
    static void saisirNum(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donnez un valeur pour a:");
            a = sc.nextInt();

            System.out.println("Donnez un valeur pour b:");
            b = sc.nextInt();
        }while(a != 0);
    }

    //PARTIE 7: PARTIE 8:
    static void saisirX(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Donner un valeur positif qui tu veux le doublé:");
            x = sc.nextInt();
        }while(x < 0);
    }
    static int doubleX(int x){
        return x * 2;
    }
}
