Ne zaman singleton design pattern kullanılır?
============================

- Bir sınıftan üretilen instance sayısını bir ile sınırlamaktır. 

Yani herhangi bir class’tan bir instance yaratılmak istendiğinde, eğer daha önce yaratılmış bir instance yoksa yeni yaratılır. 
Daha önce yaratılmış ise var olan instance kullanılır.

Singleton Desing Pattern Oluşturma Koşulları
--------------------------------------------

Singleton tasarım deseninin iki formu vardır.

- Lazy Instantiation: Çağırıldığında instance oluşturma.
- Eager Instantiation: Load time da instance oluşturma.  

1- Constructor **private** olmalı.<br>
Bu yapılan işlem new ile nesne oluşturulmasını engeller.

2- Class ile aynı türde **static member** oluşturulur.<br>
<code>private static SingletonExample instance;</code>

3- Static member’a ulaşmak için **static metot** oluşturulmalıdır.<br>
<code>public static Singleton getInstance() { … return instance; }</code>
