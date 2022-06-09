#include <stdio.h>
int main() {
    int x, min, max;
    printf("Donnez un nombre\n");
    scanf("%d", &x);
    min = x;
    max = x;

    while (x != 0) {
        if (x > max)
            max = x;
        if (x < min)
            min = x;
        printf("Donnez un nombre\n");
        scanf("%d", &x);
    }

    printf("Le min est = %d \n", min);
    printf("Le max est %d \n", max);

    return 0;
}