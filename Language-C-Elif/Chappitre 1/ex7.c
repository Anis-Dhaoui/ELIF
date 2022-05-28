#include <stdio.h>
int main()
{
    int nbIns, nbPre;
    float presence;

    printf("Nombre de candidats inscrits? ");
    scanf("%d", &nbIns);

    printf("Nombre de candidats présent? ");
    scanf("%d", &nbPre);

    presence = ((float)nbPre / nbIns) * 100; // (float) et pour le forcement

    printf("Pourcentage de présence = %.2f %% \n", presence); // pour afficher juste 2 nombre aprés la virgurle
    return 0;
}