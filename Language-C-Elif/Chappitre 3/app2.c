#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main()
{
    srand(time(NULL));
    int raNiv1 = rand() % 100 + 1, raNiv2 = rand() % 10000 + 1, xx;
    printf("%d\n", raNiv1);
    int choix, tenta = 3, nivChoisi;
    char niv1[] = "1-Niveau 1: Facile, Le mystère est un nombre entre 0 et 100";
    char niv2[] = "2-Niveau 2: Moyen, Le mystère est un nombre entre 0 et 10000";

    do
    {
        printf("%s\n%s\n", niv1, niv2);
        printf("Tappez 0 pour quiter\n");
        scanf("%d", &choix);
    } while (choix < 0 || choix > 2);

    if (choix == 1)
    {
        printf("Niveau facile: Le mystere est un nombre entre 0 et 100\n");
        printf("Saisir un numero entre 1 et 100\n");
        scanf("%d", &xx);

        do
        {
            if (xx < raNiv1)
            {
                tenta--;
                printf("Choisissez un numero superiuer a %d \n", xx);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &xx);
            }
            else if (xx > raNiv1)
            {
                tenta--;
                printf("Choisissez un numero inferieur a %d\n", xx);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &xx);
            }
            else
            {
                printf("BRAVO\n");
            }
        } while ((xx != raNiv1) && (tenta != 1));
    }

    else if (choix == 2)
    {
        printf("Niveau moyen: Le mystere est un nombre entre 0 et 10000\n");
        printf("Saisir un numero entre 1 et 10000\n");
        scanf("%d", &xx);

        do
        {
            if (xx > raNiv2)
            {
                tenta--;
                printf("Choisissez un numero superiuer a %d \n", xx);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &xx);
            }
            else if (xx < raNiv2)
            {
                tenta--;
                printf("Choisissez un numero inferieur a %d\n", xx);
                printf("il vous reste %d tentatives\n", tenta);
                scanf("%d", &xx);
            }
            else
            {
                printf("BRAVO\n");
            }
        } while ((xx != raNiv2) && (tenta != 1));
    }

    else
    {
        printf("AU REVOIR\n");
    }
    return 0;
}