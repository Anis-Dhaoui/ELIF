#include <stdio.h>
#include <math.h>

// juste pour des sorties colorées (en printf)
#define ANSI_COLOR_RED     "\x1b[31m"
#define ANSI_COLOR_GREEN   "\x1b[32m"
#define ANSI_COLOR_YELLOW  "\x1b[33m"
#define ANSI_COLOR_BLUE    "\x1b[34m"
#define ANSI_COLOR_MAGENTA "\x1b[35m"
#define ANSI_COLOR_CYAN    "\x1b[36m"
#define ANSI_COLOR_RESET   "\x1b[0m"

int main()
{
    int dateNaissance, taille, poids, interChir, arrTra, desOrol, budget;
    float IMC;
    int choix;

    char niveau1[] = "1.maximum de prestations remboursées = 3000 DT par an et parprestataire";
    char niveau2[] = "2.maximum de prestations remboursées = 3500 DT par an et parprestataire";
    char niveau3[] = "3.maximum de prestations remboursées = 5000 DT par an et parprestataire";

    char det1[] = "Niveau 1 : détails des plafonds de remboursement :\n Consultations : 20 DT / acte \n Médicaments : 400 DT \n Analyses : 150 DT \n Radiologie : 180 DT \n Chirurgie : 1500 DT \n Maximum de prestations remboursées = 3000 DT par prestataire et par an \n";
    char det2[] = "Niveau 2 : détails des plafonds de remboursement :\n Consultations : 30 DT / acte \n Médicaments : 600 DT \n Analyses : 200 DT \n Radiologie : 250 DT \n Chirurgie : 1800 DT \n Maximum de prestations remboursées = 3500 DT par prestataire et par an \n";
    char det3[] = "Niveau 3 : détails des plafonds de remboursement :\n Consultations : 40 DT / acte \n Médicaments : 600 DT \n Analyses : 300 DT \n Radiologie : 300 DT \n Chirurgie : 2000 DT \n Maximum de prestations remboursées = 5000 DT par prestataire et par an \n";

    printf("Saisie votre date de naissance: \n");
    scanf("%d", &dateNaissance);
    printf("Saisie votre taille: \n");
    scanf("%d", &taille);
    printf("Saisie votre poids: \n");
    scanf("%d", &poids);
    printf("intervention chirurgicale lors des 10 dernières années (1 si oui, 0 si non)\n");
    scanf("%d", &interChir);
    printf("un arrêt de travail de plus d'un mois lors des 5 dernières années (1 si oui, 0 si non) :\n");
    scanf("%d", &arrTra);
    printf("dépistage de sérologies virales (0 si aucun, 1 si VHA[hépatite A], 2 si VHB[hépatite B]\n");
    scanf("%d", &desOrol);
    printf("Saisie votre budget: \n");
    scanf("%d", &budget);

    IMC = poids / (taille * taille);

    if (interChir == 1 || arrTra == 1 || desOrol != 0)
        printf("Désolé tu es rejeté \n");

    else if (2022 - dateNaissance > 50 || desOrol == 1 || IMC < 16.5 || IMC > 30)
    {
        printf(ANSI_COLOR_GREEN "Liste des niveaux de prestations possibles : \n");
        printf(ANSI_COLOR_YELLOW "%s \n", niveau1);
        printf(ANSI_COLOR_MAGENTA "Tarif de cotisation total = %.0f \n", 1500 * 1.15);
        printf(ANSI_COLOR_YELLOW "%s \n", niveau2);
        printf(ANSI_COLOR_MAGENTA "Tarif de cotisation total = %.0f \n", 1800 * 1.15);
        printf(ANSI_COLOR_GREEN "Veuillez choisir le niveau de prestations souhaité :");
        scanf("%d", &choix);

        switch (choix)
        {
        case 1:
            printf(ANSI_COLOR_BLUE "%s", det1);
            break;
        case 2:
            printf(ANSI_COLOR_BLUE "%s", det2);
        default:
            printf(ANSI_COLOR_RED "Veuillez saisir: 1 ou 2");
        }
    }
    else
    {
        printf(ANSI_COLOR_GREEN "Liste des niveaux de prestations possibles : \n");
        printf(ANSI_COLOR_YELLOW "%s \n", niveau1);
        printf(ANSI_COLOR_MAGENTA "Tarif de cotisation total = 1500 \n");
        printf(ANSI_COLOR_YELLOW "%s \n", niveau2);
        printf(ANSI_COLOR_MAGENTA "Tarif de cotisation total = 1800 \n");
        printf(ANSI_COLOR_YELLOW "%s \n", niveau3);
        printf(ANSI_COLOR_MAGENTA "Tarif de cotisation total = 2100 \n");
        printf(ANSI_COLOR_GREEN "Veuillez choisir le niveau de prestations souhaité :");
        scanf("%d", &choix);

        switch (choix)
        {
        case 1:
            printf(ANSI_COLOR_BLUE "%s", det1);
            break;
        case 2:
            printf(ANSI_COLOR_BLUE "%s", det2);
            break;
        case 3:
            printf(ANSI_COLOR_BLUE "%s", det3);
            break;
        default:
            printf(ANSI_COLOR_RED "Veuillez saisir: 1, 2 ou 3");
        }
    }

    return 0;
}
