Neden adapter design pattern kullanılır?
============================

- Çoğu zaman işe yarayacağını düşündüğümüz mevcut bir sınıfı kendi sistemimizde tekrar kullanmak isteriz.
- Fakat mevcut sınıf, tam beklediğimiz gibi olmayabilir. 
Bu durumda araya bir tane adaptör yazarak, mevcut sınıfı kendi sistemimize uygun hale getirebiliriz.
- Böylece adapte edilen nesnede kod değişikliği olmadan benzer bir arayüzü destekler hale getiririz. 
Ayrıca adaptasyon işlemi sırasında, adapte edilen nesnenin desteklemediği özellikler de adaptör tarafından gerçekleştirilebilir.