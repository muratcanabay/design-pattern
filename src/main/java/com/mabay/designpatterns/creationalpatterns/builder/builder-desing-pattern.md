Neden builder design pattern?
============================

- Sınıfımızda bulunan alan sayısı fazla olursa bundan dolayı birden çok constructora ihtiyaç duyabiliriz.

- Haliyle her bir field eklendiğinde yeni bir constructor ekleme ihtiyacı hissedebiliriz. Çünkü nesneyi oluştururken hangi field başta atama yapılacak ya da yapılmayacak bilemeyebiliriz.

- Uzayıp giden parametre sayısından ve method overloading işlemlerinden kurtarmış olur.

#### Kısaca Faydaları
<em>1- Her yeni alan eklendiğinde constructora eklemekten kurtarır.
<br>(Daha az refactoring.)

2- Constructorda parametre sayısınının uzamasından kurtarır.
<br>(Kod okunaklığını arttırır.)

3- Eklenen yeni alanın, sınıf yaratılırken initialize edilip edilmeyeceği kararından kurtarır.
<br>(Tasarım kolaylığı sağlar.)   
</em>