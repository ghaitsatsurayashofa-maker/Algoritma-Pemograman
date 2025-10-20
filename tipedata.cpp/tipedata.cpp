#include <stdio.h)
#include <contio.h>
#iclude <iostream>
using namaspace std;

main()
{
    char a[30] = "---BELAJAR TIPE DATA---";
    short b;
    inct c;
    long d;
    float e;
    double f;
    int g =1;
    int h = 2;

    b = 10000;
    c = 100000;
    d = 100000000;
    e = 3.12;
    f = 3.12345;

    cout << a << endl;
    cout << "Tipe data short : " << b << endl;
    cout << "Tipe data int : " << c << endl;
    cout << "Tipe data long : " << d << endl;
    cout << "Tipe data float : " << e << endl;
    cout << "Tipe dta double : " << f << endl;
    cout << endl;

    cout << "Berikut Hasil Boolean : " << endl;
    cout << (g > h);
    cout << endl;
    cout << (g < h);
    cout << endl;
    cout << (g == h);
    cout << endl;
    cout << (g != h);
}