<?php
$tugas = readine("Masukkan nilai tugas: ");
$uts = readline("MAsukkan nilai UTS: ");
$uas = readline("Masukkan nilai UAS: ");

$nilaiAkhir = (0.3 * $tugas) + (0.3 * $uts) + (0.4 * $uas);

echo "Nilai Akhir = $nilaiAkhir\n";
if ($nilaiAkhir>=60)
    echo "Status: LULUS\n";
else
    echo "Status: TIDAK LULUS\n";
?>