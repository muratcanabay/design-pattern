Ne zaman observer design pattern kullanılır?
============================================
* Başka bir nesneye bağlı olan ve o nesnenin durumu değiştiğinde bir eylem 
gerçekleştirmeniz gereken veya bir nesnenin başkalarını bilgilendirmesi gereken her durumda 
uygulanabilecek bir tasarım modelidir.
<br>

Gerçek hayatta, bildirim (notification) yapılarında kullanılabilir.
Arkadaşlık isteği, mesaj, fotoğraf paylaşımları gibi aksiyonların
kullanıcıya bildirildiği durumlarda kullanılması tercih edilir.

Observer design pattern yapısı
==============================
<strong>Observer(Interface):</strong> Veri kaynağından gelen bilgi değişikliğini gözlemleyen ve update eden sınıf.

<strong>Observable(Class):</strong> Veri kaynağıdır. Değişiklikleri gözlemci(observer) sınıfına bildirir(nofity).