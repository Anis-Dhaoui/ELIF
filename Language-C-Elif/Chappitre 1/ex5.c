#include <stdio.h>
int main()
{
    int a, b, c;

    printf("Donner le valeur de a, b et c ");
    scanf("%d"
          "%d"
          "%d",
          &a, &b, &c);

    int aux = a;
    a = b;
    b = c;
    c = aux;

    printf("a = %d / b = %d / c = %d", a, b, c);
    return 0;
}