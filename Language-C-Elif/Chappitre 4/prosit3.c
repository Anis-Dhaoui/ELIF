#include <stdio.h>

int main() {
    float temp[15], humid[15], newVal;
    int fois, indiceVal, choix, temp_humid;

    do {
        printf("Combient de valeurs avez-vous? ");
        scanf("%d", &fois);
    } while (fois > 15 || fois < 0);

    for (int i = 0; i < fois; i++) {
        printf("Donner le valeur de temperature %d: ", i + 1);
        scanf("%f", &temp[i]);
    }
    printf("\n\n\n");
    for (int j = 0; j < fois; j++) {
        // fflush(stdout);
        printf("Donner le valeur de de humidite %d: ", j + 1);
        scanf("%f", &humid[j]);
    }

    printf("\n");

    do {
        printf("\n\n");
        printf("######################################################################################\n");
        printf("[1]: Table temperature\n");
        printf("[2]: Table humidité\n");
        printf("[3]: Modifier la valeur d'une prise donnée par son numéro\n");
        printf("[4]: Afficher l'humidité maximale et minimale et leurs numéros de prise\n");
        printf("[5]: Afficher la moyenne humidité et température.\n");
        printf("######################################################################################\n");
        scanf("%d", &choix);
        printf("\n\n");

        switch (choix) {
        case 1:
            printf("\n");
            printf("Table de temperatures\n");
            for (int x = 0; x < fois; x++) {
                printf(" %.2f |", temp[x]);
            }
            printf("\n");
            break;

        case 2:
            printf("\n");
            printf("Table de Humidité\n");
            for (int y = 0; y < fois; y++) {
                printf(" %.2f |", humid[y]);
            }
            printf("\n");
            break;

        case 3:
            printf("Donnez le nouveau valeur: ");
            scanf("%f", &newVal);
            printf("Donnez l'indice: ");
            scanf("%d", &indiceVal);
            printf("Dans quelle tableau 1 pour temp ou 2 pour humid: ");
            scanf("%d", &temp_humid);

            if (temp_humid == 1) {
                temp[indiceVal] = newVal;
                printf("Changement reussi...\n");
            } else {
                humid[indiceVal] = newVal;
                printf("Changement reussi...\n");
            }
            break;

        case 4:
            float max = humid[0];
            float min = humid[0];
            for (int z = 1; z < fois; z++) {
                if (humid[z] > max) {
                    max = humid[z];
                } else if (humid[z] < min) {
                    min = humid[z];
                }
            }
            printf("L'humidite minimale est: %f.2\n", min);
            printf("L'humidite maximale est: %f.2\n", max);
            break;

            case 5:
                float somTemp = 0;
                float somHumid = 0;
                for (int i1 = 0; i1 < fois; i1++)
                {
                    somTemp += temp[i1];
                    somHumid += humid[i1];
                }
                printf("La moyenne de temperature est %.2f\n", somTemp / fois);
                printf("La moyenne d'humidite est %.2f\n", somHumid / fois);

        
        default:
            break;
        }

    } while (choix != 0);
}