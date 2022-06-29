package somme;
import java.util.*;

class Somme {
    static int num1, num2;
    public static void main(String args[]) {

        saisirPosNum();
        System.out.println("Le resultat est: " + CalculerNums(num1, num2));

        // int n2 = 6;
        // int n3;
        // float som = 0;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Donner un valeur n1");
        // n1 = sc.nextInt();
        // System.out.println("Donner un valeur n2");
        // n2 = sc.nextInt();
        // som = CalculerNums(n1, n2);
        // System.out.println("Le resultat est " + som);

        // affRes(CalculerNums(n1, n2));

        // System.out.println("Donner un valeur n3");
        // n3 = sc.nextInt();
        // affRes(doubleRes(n3));
    }

    static int CalculerNums(int x, int y) {
        return x / y;
    }

    static void affRes(float res) {
        System.out.println("La somme est..." + res);
    }

    static int doubleRes(int db) {
        return db * 2;
    }

    static void saisirPosNum() {
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Donner un valeur A");
            num1 = sc.nextInt();

            System.out.println("Donner un valeur B");
            num2 = sc.nextInt();
        } while (num1 < 0);
    }
}