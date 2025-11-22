#include<stdio.h>
#include<conio.h>

main()
{
    char nm1[50];
    char nm2[50];

    puts("Masukkan nama pertama = ");gets(nm1);
    printf("Maukkan nama kedua = ");scanf("%s",&nm2);

    printf("\n\n");
    puts("Selamat Datang");puts(nm1);
    printf("Selamat Datang%s", nm2);
}