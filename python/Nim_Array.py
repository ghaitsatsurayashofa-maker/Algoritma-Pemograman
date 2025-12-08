nim = "2510651"  

# Membuat array digit
digits = []
for d in nim:
    digits.append(int(d))

# Perhitungan
total = sum(digits)
maksimum = max(digits)
minimum = min(digits)
rata_rata = total / len(digits)
reverse_array = digits[::-1]

# Output
print("Array digit        :", digits)
print("Total digit        :", total)
print("Digit maksimum     :", maksimum)
print("Digit minimum      :", minimum)
print("Rata-rata digit    :", rata_rata)
print("Reverse array NIM  :", reverse_array)
