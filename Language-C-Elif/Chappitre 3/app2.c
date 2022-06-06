#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() {
    srand(time(NULL));
    int raNum, shot, choix, tenta = 15;

    do {
        printf("1-Niveau 1: Facile, Le mystère est un nombre entre 0 et 100\n");
        printf("2-Niveau 2: Moyen, Le mystère est un nombre entre 0 et 10000\n");
        printf("Tappez 0 pour quiter\n");
        scanf("%d", &choix);
    } while (choix < 0 || choix > 2);

    if (choix == 1) {
        raNum = rand() % 100 + 1;
        //printf("Numero hazard du niveau 1 = %d\n", raNum); // objectif du test
        printf("Niveau facile: Le mystere est un nombre entre 0 et 100\n");
        printf("Saisir un numero entre 1 et 100\n");
        scanf("%d", &shot);
        do {
            if (shot < raNum) {
                tenta--;
                printf("Choisissez un numero superiuer a %d \n", shot);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &shot);
            } else if (shot > raNum) {
                tenta--;
                printf("Choisissez un numero inferieur a %d\n", shot);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &shot);
            }
        } while (shot != raNum && tenta != 1);
    } else if (choix == 2) {
        raNum = rand() % 10000 + 1;
        printf("Numero hazard du niveau 2 = %d\n", raNum); // objectif du test
        printf("Niveau moyen: Le mystere est un nombre entre 0 et 10000\n");
        printf("Saisir un numero entre 1 et 10000\n");
        scanf("%d", &shot);
        do {
            if (shot > raNum) {
                tenta--;
                printf("Choisissez un numero superiuer a %d \n", shot);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &shot);
            } else if (shot < raNum) {
                tenta--;
                printf("Choisissez un numero inferieur a %d\n", shot);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &shot);
            }
        } while (shot != raNum && tenta != 1);
    } else {
        printf("\n\nAU REVOIR\n\n");
    }

    if (tenta >= 1 && shot == raNum) {
        printf("\n\nBRAVO\n\n");
    } else {
        printf("\n\nGAME OVER\n\n");
    }

    return 0;
}
