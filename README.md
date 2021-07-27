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
Yukarıdaki gibi application.properties kısmında parolamızı yazıp ana dizin olan  pom.xml'in  olduğu dizinde  
 `mvn spring-boot:run` ile çalıştırıyoruz.

## Modüller 
#### Spring Data JPA
Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
#### Spring Security 
Highly customizable authentication and access-control framework for Spring applications.
#### Thymeleaf 
A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.
#### Spring Web 
Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
#### Spring Boot DevTools 
Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
#### H2 Database 
Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
#### Spring Configuration Processor 
Generate metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (ex.application.properties/.yml files).

## Uyarı
* Spring Boot Security kullandığı için direk bizi localhost:4545/login 'e atıyor.Username:admin password:admin yazarak admin olarak giriş yapabiliriz veya kayıt olarak user olarak giriş yapabiliriz.
* Kayıt olma kısmında sağlam bir güvenlik yok.Sadece uygun bir kullanıcı adı ve uygun parola olarak kayıt oluyor.Login register kısmı + özellik olduğu için önem verilmedi.
