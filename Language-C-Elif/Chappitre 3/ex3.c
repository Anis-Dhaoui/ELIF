#include <stdio.h>
int main()
{
 int num, i;

 printf("Donnez un nombre premier: ");
 scanf("%d", &num);
//  i = num - 1;

//  while (num % i != 0 && i < 2)
//  {
//      i--;
//      printf("Veillez saisir un nombre premier:");
//      scanf("%d", &num);
//  }
int i = 2;
while((i<num) && (num%i != 0)){
    i++;
}
if(i == num) printf("%d est un nombre premier", num);
else printf("%d est un nombre NON premier!", num);
    
    return 0;
}