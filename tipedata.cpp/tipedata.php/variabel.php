<?php
$nim = 'A';
$nama = "Ghaitsa Tsuraya Shofa";
$umur = 19;
$nilai = 82.25;
$status = TRUE;

echo "---Belajar Tipe Data ---<br><br>";
echo "Tipe Data Chaar :".$nim."<br>";
echo "Tipe Data String : $nama<br>";
print "<br>";
printf("Tipe Data Float :%.5f<br><br>", $nilai);
if ($status)
    echo "Status : Aktiif";
else
    echo "Status : Tidak Aktif";
?>