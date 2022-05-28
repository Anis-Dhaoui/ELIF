#include <stdio.h>
int main()
{
    int moy;
    printf("Entrer votre moyen: ");
    scanf("%d", &moy);

    if (moy < 10)
        printf("Redouble \n");
    else if (moy < 12)
        printf("Passable \n");
    else if (moy < 14)
        printf("Assez-bien \n");
    else if (moy < 16)
        printf("Bien \n");
    else
        printf("Trés bien \n");
    return 0;
}