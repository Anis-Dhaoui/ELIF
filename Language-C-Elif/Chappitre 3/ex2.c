#include <stdio.h>
int main()
{
    int n1, n2;
    do
    {
        printf("Saisir les valeurs n1: ");
        scanf("%d", &n1);
    } while (n1 == 0);
    do
    {
        printf("Saisir les valeurs n2: ");
        scanf("%d", &n2);
    } while (n2 == 0 || n2 <= n1);

    for(int i = n1; i <= n2; i++){
        if(i % 2 == 0){
            printf("%d\n", i);
        }
    }
    
    return 0;
}