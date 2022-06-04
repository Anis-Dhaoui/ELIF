#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int main()
{
    int choix;
    char piz[] = "1 - Pizza";
    char p_e[] = "2 - Plat Escalope";
    char p_p_r[] = "3 - Plat Poulet Routi";
    char p_g[] = "4 - Plat Grillade";

    do
    {
        do
        {
            printf("%s\n%s\n%s\n%s\n", piz, p_e,p_p_r,p_g);
            printf("Tappez 0 pour quiter\n");
            scanf("%d", &choix);
        } while (choix > 4);
        switch (choix)
        {
        case 1:
            printf("%s", piz);
            break;
        case 2:
            printf("%s", p_e);
            break;
        case 3:
            printf("%s", p_p_r);
            break;
        case 4:
            printf("%s", p_g);
            break;
        default:
            break;
        }
    } while (choix != 0);
    
    return 0;
}