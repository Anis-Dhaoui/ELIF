#include<stdio.h>

int main(){
    int x;
    do
    {
        printf("Donner un nombre: ");
        scanf("%d", &x);
    } while (x < 2);
    
    for(int i = x; i > 1 ; i--){
        if(x % i == 0){
            printf("%d est un diviseur de %d \n", i, x);
        }
    }
}