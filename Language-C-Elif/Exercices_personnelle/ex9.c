#include <stdio.h>

int main() {
    int a, b, aux;
    do {
        printf("Donner nombre a ");
        scanf("%d", &a);
        printf("Donner nombre b ");
        scanf("%d", &b);
    } while (a <= 0 && b <= 0);

    while (b > 0)
    {
        if(b % 2 == 0){
            a = 2 * a;
            b = b / 2;
            printf("%d * %d + %d \n", a, b, aux);
        }else{
            aux += a;
            b = b - 1;
            printf("%d * %d + %d \n", a, b, aux);
        }
    }
    printf("%d\n", aux);
    
}