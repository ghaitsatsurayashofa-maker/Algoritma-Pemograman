#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    string nim;
    cout << "Masukkan NIM: ";
    cin >> nim;

    vector<int> digits;

    for (char c : nim) {
        digits.push_back(c - '0');
    }

    int total = 0;
    int maks = digits[0];
    int min = digits[0];

    for (int d : digits) {
        total += d;
        if (d > maks) maks = d;
        if (d < min) min = d;
    }

    double rata = (double) total / digits.size();

    vector<int> reverse_arr = digits;
    reverse(reverse_arr.begin(), reverse_arr.end());

    cout << "Array digit        : ";
    for (int d : digits) cout << d << " ";
    cout << endl;

    cout << "Total digit        : " << total << endl;
    cout << "Digit maksimum     : " << maks << endl;
    cout << "Digit minimum      : " << min << endl;
    cout << "Rata-rata digit    : " << rata << endl;

    cout << "Reverse array NIM  : ";
    for (int d : reverse_arr) cout << d << " ";
    cout << endl;

    return 0;
}