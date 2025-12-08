nim = input("Masukkan NIM")  

digits = []
for d in nim:
    digits.append(int(d))

total = sum(digits)
maksimum = max(digits)
minimum = min(digits)
rata_rata = total / len(digits)
reverse_array = digits[::-1]

print("Array digit        :", digits)
print("Total digit        :", total)
print("Digit maksimum     :", maksimum)
print("Digit minimum      :", minimum)
print("Rata-rata digit    :", rata_rata)
print("Reverse array NIM  :", reverse_array)