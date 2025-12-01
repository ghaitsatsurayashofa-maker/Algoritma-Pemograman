<?php

function validasi_nama($nama) {
    return ctype_alpha($nama);
}

do {
    $nama = readline("Masukkan nama anda: ");
    if (!validasi_nama($nama)) {
        echo "Nama tidak valid! Harus huruf semua.\n\n";
    }
} while (!validasi_nama($nama));

$nim = readline("Masukkan NIM anda (angka saja): ");
$saldo = (int)$nim;

echo "\nHalo $nama, saldo awal kamu adalah Rp " . number_format($saldo, 0, ',', '.') . "\n\n";

while (true) {
    echo "===== MENU ATM =====
1. Cek Saldo
2. Tarik Tunai
3. Setor Tunai
4. Transfer
5. Keluar\n";

    $pil = readline("Pilih menu: ");

    switch ($pil) {
        case 1:
            echo "Saldo kamu: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";
            break;

        case 2:
            $tarik = readline("Jumlah tarik: ");
            if ($tarik <= $saldo) {
                $saldo -= $tarik;
                echo "Tarik berhasil! Saldo sekarang: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";
            } else {
                echo "Saldo tidak cukup!\n\n";
            }
            break;

        case 3:
            $setor = readline("Jumlah setor: ");
            $saldo += $setor;
            echo "Setor berhasil! Saldo sekarang: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";
            break;

        case 4:
            $transfer = readline("Jumlah transfer: ");
            if ($transfer <= $saldo) {
                $saldo -= $transfer;
                echo "Transfer berhasil! Saldo sekarang: Rp " . number_format($saldo, 0, ',', '.') . "\n\n";
            } else {
                echo "Saldo tidak cukup!\n\n";
            }
            break;

        case 5:
            echo "Terima kasih telah menggunakan ATM!\n";
            exit;

        default:
            echo "Menu tidak valid!\n\n";
    }
}