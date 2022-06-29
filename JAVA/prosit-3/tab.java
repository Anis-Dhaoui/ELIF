import java.util.*;

class tab {
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
        
        for (int j = 0; j < tab.length; j++) {
            System.out.println(tab[j]);
        }
    }
}