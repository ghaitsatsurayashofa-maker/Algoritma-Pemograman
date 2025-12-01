#include <iostream>
#include <string>
#include <cctype>
using namespace std;

bool validasiNama(const string& nama) {
    for (char c : nama) {
        if (!isalpha(c)) return false;
    }
    return true;
}

int main() {
    string nama, nim;
    int saldo;

    do {
        cout << "Masukkan nama anda: ";
        cin >> nama;
        if (!validasiNama(nama)) {
            cout << "Nama tidak valid! Harus huruf semua.\n\n";
        }
    } while (!validasiNama(nama));

    cout << "Masukkan NIM anda (angka saja): ";
    cin >> nim;
    saldo = stoi(nim);

    cout << "\nHalo " << nama << ", saldo awal kamu adalah Rp " << saldo << "\n\n";

    while (true) {
        cout << "===== MENU ATM =====\n"
             << "1. Cek Saldo\n"
             << "2. Tarik Tunai\n"
             << "3. Setor Tunai\n"
             << "4. Transfer\n"
             << "5. Keluar\n"
             << "Pilih menu: ";

        int pilih;
        cin >> pilih;

        switch (pilih) {
            case 1:
                cout << "Saldo kamu: Rp " << saldo << "\n\n";
                break;

            case 2: {
                int tarik;
                cout << "Jumlah tarik: ";
                cin >> tarik;

                if (tarik <= saldo) {
                    saldo -= tarik;
                    cout << "Tarik berhasil! Saldo sekarang: Rp " << saldo << "\n\n";
                } else {
                    cout << "Saldo tidak cukup!\n\n";
                }
                break;
            }

            case 3: {
                int setor;
                cout << "Jumlah setor: ";
                cin >> setor;

                saldo += setor;
                cout << "Setor berhasil! Saldo sekarang: Rp " << saldo << "\n\n";
                break;
            }

            case 4: {
                int transfer;
                cout << "Jumlah transfer: ";
                cin >> transfer;

                if (transfer <= saldo) {
                    saldo -= transfer;
                    cout << "Transfer berhasil! Saldo sekarang: Rp " << saldo << "\n\n";
                } else {
                    cout << "Saldo tidak cukup!\n\n";
                }
                break;
            }

            case 5:
                cout << "Terima kasih telah menggunakan ATM!\n";
                return 0;

            default:
                cout << "Menu tidak valid!\n\n";
        }
    }
}