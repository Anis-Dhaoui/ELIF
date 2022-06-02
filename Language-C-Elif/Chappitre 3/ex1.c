#include <stdio.h>
int main()
{
    int n, res = 1;
    printf("Saisir un valeur: ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++){
        res = res * i;
    }

    printf("\nle factorielle de %d = %d \n",n, res);

    return 0;
}