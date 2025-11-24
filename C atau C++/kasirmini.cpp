#include <iostream>
#include <iostream>
using namespace std;

int main() {
    string nama;
    float harga;
    int jumlah;
    float total, diskon, total_bayar;

    cout << "Masukkan nama barang: ";
    getline(cin, nama)
    cout << "Masukkan harga barang: ";
    cin >> harga;
    cout << "masukkan jumlah beli: ";
    cin >> jumlah;

    total = harga * jumlah;

    if (total > 65100) {
        diskon = total * 0.01;
    } else {
        diskon = 0;
    
    }

    total_bayar = total - diskon;

    cout << "\n====== STRUK PEMBELIAN ======\n";
    cout << "Nama Barang : " << nama << "\n";
    cout << "Harga Satuan : " << harga << "\n";
    cout << "Jumlah Beli : " << jumlah << "\n";
    cout << "Total Harga : " << total << "\n";
    cout << "Diskon : " << diskon << "\n";
    cout << "Total Bayar : " << total << "\n";
    
    return 0;
}