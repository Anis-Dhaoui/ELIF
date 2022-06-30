import java.util.*;

class Ex3 {
    public static void main(String args[]) {
        // int[] tab = {40, 5, 4, 0, 4, 4, 4};
        int[] tab;
        tab = new int[3];
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Donner un valeur pour la colone " + i);
                num = sc.nextInt();
            } while (num == 0);
            tab[i] = num; 
        }

        for (int j = 0; j < tab.length; j++) {
            System.out.printf("%2s %s ", tab[j], "|");
        }
        System.out.println();

        int prod = 1;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] > 0){
                prod *= tab[i];
            }
        }
        System.out.println("Le produit est " + prod);
    }
}