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
Spring Boot'u herhangi bir standart Java kitaplığıyla aynı şekilde kullanabilirsiniz. Bunu yapmak için uygun şu linkten https://repo.spring.io/milestone/org/springframework/boot/spring-boot-cli/1.3.0.M1/spring-boot-cli-1.3.0.M1-bin.zipspring-boot-*.jar dosyalarını sınıf yolunuza ekleyin. Spring Boot, herhangi bir özel araç entegrasyonu gerektirmez, bu nedenle herhangi bir IDE veya metin düzenleyiciyi kullanabilirsiniz. Ayrıca, Spring Boot uygulamasının özel bir yanı yoktur, bu nedenle, diğer Java programlarında olduğu gibi Spring Boot uygulamasını çalıştırabilir ve hatalarını ayıklayabilirsiniz.
#### Projede maven kullanıldığı için;
 Maven bir paket yöneticisi ile kurulabilir. OSX Homebrew kullanıyorsanız, brew install maven'i deneyin. Ubuntu kullanıcıları sudo apt-get install maven'i çalıştırabilir. Chocolatey'li Windows kullanıcıları, yükseltilmiş (yönetici) isteminden choco install maven çalıştırabilir.

#### Veritabanı tarafı 
Hibernate kullanıldığı için her şey oto bir şekilde olur.Sadece proje dosyasının src/main/resources altında templates içinde application.properties  config dosyasında spring.security.user.password kısmına kullandığımız veritabanı sistemindeki hesabın şifresini yazalım.

## Projeyi Çalıştırma
#### Eclipse ve benzeri editörler için: 
 Projeyi import ettikten sonra application.properties kısmında spring.security.user.password kısmına veritabanı yönetim sisteminin sifresini yazıyoruz.Sonra /src/main/java/ridvan/staj/MovieCollectionInternProject/ dizindeki MovieCollectionInternProjectApplication classı çalıştırıyoruz.
#### Eğer terminal üzerinden çalıştırılacaksa:
Yukarıdaki gibi application.properties kısmında parolamızı yazıp FilmKoleksiyonUygulamasi pom.xml olduğu dizinine gelip 
 `./mvnw spring-boot:run` ile çalıştırıyoruz.

## Uyarı
* Spring Boot Security kullandığı için direk bizi localhost:4545/login 'e atıyor.Username:admin password:admin yazarak admin olarak giriş yapabiliriz veya kayıt olarak user olarak giriş yapabiliriz.
* Kayıt olma kısmında sağlam bir güvenlik yok.Sadece uygun bir kullanıcı adı ve uygun parola olarak kayıt oluyor.Login register kısmı + özellik olduğu için önem verilmedi.
