# Spring Java Spring Film Koleksiyon Uygulaması

  ### Uygulama istenilen 
    * Film Tanımı ( Ad, Yayın Yılı, Tür, Açıklama, Medya, Dil seçenekleri )
    * Bir film için n tane Oyuncu tanımı yapılabilmeli ( Ad Soyad, isteğe
    * bağlı rol ).
    * Film Adı, Oyuncu Adı, Tür ile arama yapılabilmeli, yıla göre sıralama
    *yapılabilmeli.
    *Var olan bir kayıt üzerinde değişiklik yapılabilmeli.
    *Var olan kayıtlar incelebilmeli.
    *Var olan bir kayıt silinebilmeli.


## Kurulumu 
### Kurulumu 2 aşamada inceleyeğiz.
#### 1.Dosyaları dahil etme 
   Kullanılan editöre göre örneğin Eclipse veya IntelliJ IDEA üzerinde dahil etmemiz gerekiyor.Ben popüler olan Eclipse olan editöründe göstericem.
 #### Eclipse 
 * Açık olan bir workspace 'da file seçeneğinden sonra importa tıklıyoruz.
 * Bizim yaptığım uygulamada maven kullanıldı.Maven Kısmında 'Existing Maven Projects' tıklıyoruz.
 * Açılan ekranda Browse'a tıklayıp indirilen projenin root dizinine tıklıyoruz.MovieCollectionInterProject vb. 
 * Eğer projeyi doğru seçtiysek projenin pox.xml dosyası seçili olarak karşımıza çıkar.Buradan sonra finish'e tıklıyoruz.
#### Veritabanı tarafı 
Hibernate kullanıldığı için her şey oto bir şekilde olur.Sadece proje dosyasının src/main/resources altında templates içinde application.properties  config dosyasında spring.security.user.password kısmına kullandığımız veritabanı sistemindeki hesabın şifresini yazalım.

## Projeyi Çalıştırma
 Kurulum aşamasında bir problem yaşanmadıysa 
src/main/java dizini altında ridvan.staj.MovieCollectionInternProject package'ın altında MovieCollectionInternProjectApplication.java üzerine sağ click yapıp Run as seçeneğinden  1 Java Application tıklıyoruz.Console'da en son  "Started MovieCollectionInternProjectApplication in 18.381 seconds (JVM running for 20.746)" mesajıyla karşılaştıysak arama çubuğuna localhost:4545 yazarak giriş yapabiliriz.

## Uyarı
* Spring Boot Security kullandığı için direk bizi localhost:4545/login 'e atıyor.Username:admin password:admin yazarak admin olarak giriş yapabiliriz veya kayıt olarak user olarak giriş yapabiliriz.
* Kayıt olma kısmında sağlam bir güvenlik yok.Sadece uygun bir kullanıcı adı ve uygun parola olarak kayıt oluyor.Login register kısmı + özellik olduğu için önem verilmedi.
