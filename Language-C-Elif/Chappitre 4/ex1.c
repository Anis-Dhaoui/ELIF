#include <stdio.h>

int main(){
    char tab[10] = {'a', 'b', 'c', 'd', 'a', 'a', 'd', 'd', 'c'}, a, x;
    int nb_occ = 0, index = -1;

    // Question 1
    for(int i = 0; i < 9; i++){
        printf(" %c |", tab[i]);
    }

    // Question 2 et 3
    printf("\n");
    printf("Donnez un caractere: ");
    scanf("%c", &a);

    for(int j = 0; j < 10; j++){
        if(tab[j] == a){
            nb_occ += 1;

            if(index == -1){
                index = j;
            }
        }
    }
    for(int x = index; x < 10; x++){
        tab[index] = tab[index + 1];
    }

        for(int i = 0; i < 9; i++){
        printf(" %c |", tab[i]);
    }

    printf("Le nombre d'occurence de %c est: %d\n",a, nb_occ);
    printf("Le caractere %c est a l'indice %d\n",a, index);
}