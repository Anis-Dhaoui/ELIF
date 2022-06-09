#include<stdio.h>
int main(){
    float a, b;
    printf("Saisir un nombre a: ");
    scanf("%f", &a);
    printf("Saisir un nombre b: ");
    scanf("%f", &b);
    int res = a * b;
    printf("le resultat est: %d \n", res);
    return 0;
}