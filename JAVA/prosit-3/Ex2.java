import java.util.*;

class Ex2 {
    public static void main(String args[]) {
        int tab[];
        tab = new int[3];
        Scanner sc = new Scanner(System.in);
        int num;
        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Donner un valeur pour la colone " + (i + 1));
                num = sc.nextInt();
            } while (num < 0);
            tab[i] = num; 
        }
        Arrays.sort(tab);

        for (int j = 0; j < tab.length; j++) {
            System.out.printf("%2s %s ", tab[j], "|");
        }
        System.out.println();

        int min = tab[0];
        int max = tab[tab.length];
        int moy = tab[tab.length / 2];
        // int posMin = 0, posMax = 0, posMoy = 0;
        // for (int i = 0; i < tab.length; i++) {
        //     if (tab[i] > max) {
        //         max = tab[i];
        //         posMax = i;
        //     }
        //     if (tab[i] < min) {
        //         min = tab[i];
        //         posMin = i;
        //     }

        //     // som = som + tab[i];
        // }

        System.out.println("Max = " + max + " dans la position " + tab.length);
        System.out.println("Min = " + min + " dans la position " + 0);
        System.out.println("Moyenne = " + moy + " dans la position " + (tab.length / 2));
    }
}