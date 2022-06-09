#include<stdio.h>
int main(){
    char a;
    printf("Saisir un un caractere: ");
    scanf("%c", &a);
    printf("le code decimal de %c est: %d \n",a, a);
    printf("le code hexa de %c est: %d \n",a, a-24);
    return 0;
}