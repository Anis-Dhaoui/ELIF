#include<stdio.h>
int main(){
    int a, b, c, max = 0;
    printf("Saisir les nombre a, b et c: ");
    scanf("%d %d %d", &a, &b, &c);

    if(a > max)
    max = a;
    if(b > max)
    max = b;
    if(c > max)
    max = c;

    printf("Max = %d \n", max);
    return 0;
}